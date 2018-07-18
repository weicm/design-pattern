package cn.design.pattern.visitor;

/**
 * <p>Created by weicm on 2018/7/18 11:08</p>
 * <p>Desp: 抽象访问者</p>
 * <p>&nbsp;&nbsp; 这里表示行为</p>
 */
public abstract class Action {
    protected String desc;

    public Action(String desc) {
        this.desc = desc;
    }

    //这里可以使用方法重载，即方法名一样，参数不一样，利用Java语言的多态实现第二级分派
    public abstract void getManConclusion(Man man);
    public abstract void getWomanConclusion(Woman woman);
}
