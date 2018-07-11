package cn.design.mode.mediator;

import java.util.Map;

/**
 * <p>Created by weicm on 2018/7/11 10:48</p>
 * <p>Desp: 具体中介者</p>
 * <p>&nbsp;&nbsp; 维护同事对象之间的映射关系，并负责同事对象之间的消息传递</p>
 */
public class ConcreteMediator extends Mediator {
    private Map<Colleague, Colleague> relationMap;

    @Override
    public void send(String msg, Colleague colleague) {
        Colleague receiver = relationMap.get(colleague);
        receiver.handle(msg);
    }

    public Map<Colleague, Colleague> getRelationMap() {
        return relationMap;
    }

    public void setRelationMap(Map<Colleague, Colleague> relationMap) {
        this.relationMap = relationMap;
    }
}
