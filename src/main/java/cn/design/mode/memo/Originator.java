package cn.design.mode.memo;

/**
 * <p>Created by weicm on 2018/7/2 10:11</p>
 * <p>Desp: 发起人</p>
 * <p>&nbsp;&nbsp; 发起人，负责创建一个备忘录，用以记录自己当前的状态，并可以使用已有备忘录恢复自己的内部状态。</p>
 */
public class Originator {
    private String state;

    public void showSate() {
        System.out.println(String.format("Current state: %s", state));
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void loadMemento(Memento memento) {
        this.state = memento.getState();
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }
}
