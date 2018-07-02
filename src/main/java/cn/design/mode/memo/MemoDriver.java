package cn.design.mode.memo;

/**
 * <p>Created by weicm on 2018/7/2 10:21</p>
 * <p>Desp: 备忘录模式</p>
 */
public class MemoDriver {
    public static void main(String[] args) {
        //初始状态为 On
        Originator originator = new Originator();
        originator.setState("On");
        originator.showSate();

        //备忘状态
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        //新状态为 Off
        originator.setState("Off");
        originator.showSate();

        //恢复之前备忘的状态 On
        originator.loadMemento(caretaker.getMemento());
        originator.showSate();
    }
}
