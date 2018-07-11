package cn.design.mode.mediator;

/**
 * <p>Created by weicm on 2018/7/11 10:44</p>
 * <p>Desp: 抽象同事类</p>
 * <p>&nbsp;&nbsp; 持有中介者对象，将消息发送给中介者，由中介者代理发送消息</p>
 */
public abstract class Colleague {
    protected String name;
    protected Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void send(String msg) {
        mediator.send(msg, this);
    }
    public abstract void handle(String msg);
}
