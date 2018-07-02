package cn.design.mode.memo;

/**
 * <p>Created by weicm on 2018/7/2 10:12</p>
 * <p>Desp: 守护者</p>
 * <p>&nbsp;&nbsp; 负责保存备忘录</p>
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
