package cn.design.mode.interpreter;

/**
 * <p>Created by weicm on 2018/7/14 11:48</p>
 * <p>Desp: 终结符表达式</p>
 */
public class TExpr extends Expr {
    //数值
    private final double value;

    public TExpr(String symbol) {
        super(symbol);
        this.value = Double.valueOf(symbol);
    }

    @Override
    public double interpret() {
        return value;
    }
}
