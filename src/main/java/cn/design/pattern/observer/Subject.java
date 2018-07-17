package cn.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weicm on 2018/5/31.
 */
public abstract class Subject {
    private List<Observer> obserbers = new ArrayList<>();

    public void attach(Observer obserber) {
        obserbers.add(obserber);
    }

    public void detatch(Observer obserber) {
        obserbers.remove(obserber);
    }

    public void notif() {
        for (Observer o : obserbers) {
            o.update();
        }
    }
}
