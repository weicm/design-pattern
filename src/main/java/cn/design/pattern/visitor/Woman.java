package cn.design.pattern.visitor;

/**
 * <p>Created by weicm on 2018/7/18 11:10</p>
 * <p>Desp: 具体元素B</p>
 * <p>&nbsp;&nbsp; 这里表示女人</p>
 */
public class Woman extends Person {
    public Woman() {
        super("女人");
    }

    @Override
    public void accept(Action action) {
        action.getWomanConclusion(this);
    }
}
