package cn.design.pattern.memo;

/**
 * <p>Created by weicm on 2018/7/2 10:11</p>
 * <p>Desp: 备忘录</p>
 * <p>&nbsp;&nbsp; 备忘录，负责保存发起人的内部状态，并防止发起人之外的其他对象修改备忘录</p>
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
