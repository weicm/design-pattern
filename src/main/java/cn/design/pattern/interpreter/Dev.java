package cn.design.pattern.interpreter;

/**
 * <p>Created by weicm on 2018/7/14 11:48</p>
 * <p>Desp: 除法</p>
 */
public class Dev extends NTExpr {
    public Dev(String symbol) {
        super(symbol, 2);
    }

    @Override
    public double interpret() {
        return l.interpret() / r.interpret();
    }
}
