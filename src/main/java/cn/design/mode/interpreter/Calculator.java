package cn.design.mode.interpreter;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * <p>Created by weicm on 2018/7/14 11:44</p>
 * <p>Desp: 计算器</p>
 * <p>&nbsp;&nbsp;&nbsp;&nbsp; 支持的操作符：+,-,*,/(,)</p>
 */
public class Calculator {
    //逆波兰表达式栈
    private Stack<Expr> ips = new Stack<>();
    //操作符栈
    private Stack<Expr> os = new Stack<>();
    //语法树栈
    private Stack<Expr> gts = new Stack<>();
    //表达式语句
    private String[] statement;

    public Calculator() {

    }

    /**
     * <p>Created by weicm on 2018/7/14 11:44</p>
     * <p>Desp: 计算</p>
     * @param statement 表达式
     * @return 结果
     */
    public double calculate(String statement) {
        this.statement = statement.replaceAll(" +", " ").split(" ");
        compile();
        parse();
        return gts.pop().interpret();
    }

    /**
     * <p>Created by weicm on 2018/7/14 11:44</p>
     * <p>Desp: 将表达式便以为逆波兰表达式</p>
     */
    private void compile() {
        for (int i = 0; i < statement.length; i++) {
            String c = statement[i];
            Expr e = null;
            switch (c) {
                case "+":
                    e = new Add(c);
                    break;
                case "-":
                    e = new Sub(c);
                    break;
                case "*":
                    e = new Mul(c);
                    break;
                case "/":
                    e = new Dev(c);
                    break;
                case "(":
                case ")":
                    e = new Curves(c);
                    break;
                default:
                    e = new TExpr(c);
                    break;
            }

            if (e instanceof TExpr) {//操作数直接入逆波兰表达式栈
                ips.push(e);
            } else if (e instanceof NTExpr && !(e instanceof Curves)) {//操作符需要比较优先级
                NTExpr nte = (NTExpr) e;
                //操作符栈栈顶是操作符，并且当前操作符优先级比栈顶操作符优先级低的，先弹出栈顶操作符，并入栈到逆波兰表达式栈
                if (!os.isEmpty() && !(os.peek() instanceof Curves) && nte.getPriority() < ((NTExpr) os.peek()).getPriority()) {
                    ips.push(os.pop());
                }
                //操作符栈为空，栈顶是括号，或当前操作符优先级比栈顶操作符栈顶优级高或相等，则直接入栈
                os.push(nte);
            } else {//括号需要判断是左括号还是右括号
                Curves be = (Curves) e;
                //左括号直接入操作符栈
                if (be.isLeft())
                    os.push(be);
                else {//右括号，则依次弹出操作符栈的元素，知道遇到左括号
                    while (!(os.peek() instanceof Curves)) {
                        ips.push(os.pop());
                    }
                    //左后丢弃左括号
                    os.pop();
                }
            }
        }
        //将操作符栈剩余元素依次弹出，并入栈到逆波兰表达式栈
        while (!os.isEmpty())
            ips.push(os.pop());
    }

    /**
     * <p>Created by weicm on 2018/7/14 11:45</p>
     * <p>Desp: 解析语法树</p>
     * <p>&nbsp;&nbsp;&nbsp;&nbsp; 先输出逆波兰表达式，再把逆波兰表达式解析为语法树</p>
     */
    private void parse() {
        //输出逆波兰表达式
        List<Object> es = Arrays.asList(ips.toArray(new Expr[ips.size()])).stream().map(Expr::getSymbol).collect(Collectors.toList());
        System.out.println(String.format("Inverse Polish expression: %s", es));
        //逆波兰表达式反转存入操作符栈，此时操作符栈只当做临时栈
        while (!ips.isEmpty()) {
            os.push(ips.pop());
        }

        //依次去除你不懒表达式元素
        while (!os.isEmpty()) {
            Expr e = os.pop();
            //遇到操作符，则从语法树栈去除左右元素，并设置给操作符
            if (e instanceof NTExpr) {
                NTExpr nte = (NTExpr) e;
                nte.setR(gts.pop());
                nte.setL(gts.pop());
            }
            //遇到操作数，则直接入栈到语法树栈
            gts.push(e);
        }
    }
}
