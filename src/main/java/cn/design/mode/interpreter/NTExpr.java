package cn.design.mode.interpreter;

/**
 * <p>Created by weicm on 2018/7/14 11:47</p>
 * <p>Desp: 非终结符表达式</p>
 */
public abstract class NTExpr extends Expr {

    //优先级
    private final Integer priority;
    //左操作数
    protected Expr l;
    //右操作数
    protected Expr r;


    public NTExpr(String symbol, Integer priority) {
        super(symbol);
        this.priority = priority;
    }

    public Expr getL() {
        return l;
    }

    public Expr getR() {
        return r;
    }

    public void setL(Expr l) {
        this.l = l;
    }

    public void setR(Expr r) {
        this.r = r;
    }

    public Integer getPriority() {
        return priority;
    }
}
