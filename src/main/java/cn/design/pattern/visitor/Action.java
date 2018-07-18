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

    public abstract void getManConclusion(Man man);
    public abstract void getWomanConclusion(Woman woman);
}
