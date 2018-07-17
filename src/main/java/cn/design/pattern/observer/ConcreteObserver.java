package cn.design.pattern.observer;

/**
 * Created by weicm on 2018/5/31.
 */
public class ConcreteObserver extends Observer {
    private String name;
    private ConcreteSubject subject;
    private String observerState;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getObserverState() {
        return observerState;
    }

    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println(String.format("观察者 %s 的新状态是 %s", name, observerState));
    }
}
