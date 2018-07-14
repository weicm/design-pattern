package cn.design.mode.interpreter;

/**
 * <p>Created by weicm on 2018/7/14 11:50</p>
 * <p>Desp: 括号</p>
 */
public class Curves extends NTExpr {
    public Curves(String start) {
        super(start, null);
    }

    @Override
    public double interpret() {
        throw new RuntimeException("不支持该操作！");
    }

    public boolean isLeft() {
        return symbol.equals("(") ? true : false;
    }
}
