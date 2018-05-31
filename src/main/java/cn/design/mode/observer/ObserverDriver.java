package cn.design.mode.observer;

/**
 * Created by weicm on 2018/5/31.
 */
public class ObserverDriver {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver("X", subject));
        subject.attach(new ConcreteObserver("Y", subject));
        subject.attach(new ConcreteObserver("Z", subject));

        subject.setSubjectState("RUN");
        subject.notif();
    }
}
