package cn.design.pattern.command;

/**
 * <p>Created by weicm on 2018/7/9 11:07</p>
 * <p>Desp: 具体请求A</p>
 * <p>&nbsp;&nbsp; 该请求调用 action1</p>
 */
public class ConcreteCommandA extends Command {
    public ConcreteCommandA(Receiver reciever) {
        super(reciever);
    }

    @Override
    public void execute() {
        reciever.action1();
    }
}
