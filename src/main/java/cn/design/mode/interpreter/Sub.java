package cn.design.mode.interpreter;

/**
 * <p>Created by weicm on 2018/7/14 11:48</p>
 * <p>Desp: 减法</p>
 */
public class Sub extends NTExpr {
    public Sub(String symbol) {
        super(symbol, 1);
    }

    @Override
    public double interpret() {
        return l.interpret() - r.interpret();
    }
}
