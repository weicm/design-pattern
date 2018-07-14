package cn.design.mode.interpreter;

/**
 * <p>Created by weicm on 2018/7/14 8:56</p>
 * <p>Desp: 抽象表达式</p>
 */
public abstract class Expr {
    //符号
    protected final String symbol;

    public Expr(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public abstract double interpret();
}
