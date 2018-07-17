package cn.design.pattern.state;

/**
 * <p>Created by weicm on 2018/6/27 9:25</p>
 * <p>Desp: 上下文对象</p>
 * <p>&nbsp;&nbsp; 维护一个State子类实例， 这个实例定义了当前的状态</p>
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void request() {
        System.out.println("当前状态：" + state.getStatus());
        state.handle(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
