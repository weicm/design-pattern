package cn.design.mode.state;

/**
 * <p>Created by weicm on 2018/6/27 9:37</p>
 * <p>Desp: 具体的状态类，封装具体的相应行为</p>
 */
public class ConcreteStateA extends State {
    public ConcreteStateA() {
        super("A");
    }

    @Override
    public void handle(Context ctx) {
        ctx.setState(new ConcreteStateB());
    }
}
