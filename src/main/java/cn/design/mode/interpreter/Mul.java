package cn.design.mode.interpreter;

/**
 * <p>Created by weicm on 2018/7/14 11:48</p>
 * <p>Desp: 乘法</p>
 */
public class Mul extends NTExpr {
    public Mul(String symbol) {
        super(symbol, 2);
    }

    @Override
    public double interpret() {
        return l.interpret() * r.interpret();
    }
}
