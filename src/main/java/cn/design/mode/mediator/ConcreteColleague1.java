package cn.design.mode.mediator;

/**
 * <p>Created by weicm on 2018/7/11 10:52</p>
 * <p>Desp: 具体同事类</p>
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void handle(String msg) {
        System.out.println(String.format("%s 接收到消息： %s", name, msg));
    }
}
