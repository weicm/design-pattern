package cn.design.mode.state;

/**
 * Created by weicm on 2018/6/27.
 */
public class StateDriver {
    public static void main(String[] args) {
        Context ctx = new Context(new ConcreteStateA());
        for (int i=0; i<5; i++) {
            ctx.request();
        }
    }
}
