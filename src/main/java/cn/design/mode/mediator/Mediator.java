package cn.design.mode.mediator;

/**
 * <p>Created by weicm on 2018/7/11 10:46</p>
 * <p>Desp: 抽象中介者</p>
 * <p>&nbsp;&nbsp; 负责同事对象之间的消息传递</p>
 */
public abstract class Mediator {
    public abstract void send(String msg, Colleague colleague);
}
