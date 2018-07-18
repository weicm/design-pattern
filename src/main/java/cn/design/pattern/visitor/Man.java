package cn.design.pattern.visitor;

/**
 * <p>Created by weicm on 2018/7/18 11:09</p>
 * <p>Desp: 具体元素A</p>
 * <p>&nbsp;&nbsp; 这里表示男人</p>
 */
public class Man extends Person{
    public Man() {
        super("男人");
    }

    @Override
    public void accept(Action action) {
        action.getManConclusion(this);
    }
}
