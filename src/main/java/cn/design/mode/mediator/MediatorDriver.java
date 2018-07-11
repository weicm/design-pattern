package cn.design.mode.mediator;

import java.util.HashMap;

/**
 * <p>Created by weicm on 2018/7/11 11:00</p>
 * <p>Desp: 中介者模式</p>
 */
public class MediatorDriver {
    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();
        Colleague c1 = new ConcreteColleague1("c1", m);
        Colleague c2 = new ConcreteColleague2("c2", m);

        HashMap<Colleague, Colleague> relationMap = new HashMap<>();
        relationMap.put(c1, c2);
        relationMap.put(c2, c1);

        m.setRelationMap(relationMap);

        c1.send("吃过饭了吗？");
        c2.send("没呢，你打算请客？");
    }
}
