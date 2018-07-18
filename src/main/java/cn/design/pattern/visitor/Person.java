package cn.design.pattern.visitor;

/**
 * <p>Created by weicm on 2018/7/18 11:07</p>
 * <p>Desp: 抽象元素</p>
 * <p>&nbsp;&nbsp; 这里表示人</p>
 */
public abstract class Person {
    protected String desc;

    public Person(String desc) {
        this.desc = desc;
    }

    public abstract void accept(Action action);
}
