package cn.design.pattern.interpreter;

/**
 * <p>Created by weicm on 2018/7/14 11:48</p>
 * <p>Desp: 加法</p>
 */
public class Add extends NTExpr {
    public Add(String symbol) {
        super(symbol, 1);
    }

    @Override
    public double interpret() {
        return l.interpret() + r.interpret();
    }
}
