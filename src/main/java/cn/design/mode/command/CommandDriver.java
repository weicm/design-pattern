package cn.design.mode.command;

/**
 * <p>Created by weicm on 2018/7/9 11:08</p>
 * <p>Desp: 命令模式</p>
 */
public class CommandDriver {
    public static void main(String[] args) {
        Receiver r = new Receiver();
        Invoker invoker = new Invoker();
        ConcreteCommandA ca1 = new ConcreteCommandA(r);
        ConcreteCommandA ca2 = new ConcreteCommandA(r);
        ConcreteCommandB cb = new ConcreteCommandB(r);

        invoker.addCommand(ca1);
        invoker.addCommand(ca2);
        invoker.addCommand(cb);

        invoker.execute();
    }
}
