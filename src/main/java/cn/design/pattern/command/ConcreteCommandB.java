package cn.design.pattern.command;

/**
 * <p>Created by weicm on 2018/7/9 11:07</p>
 * <p>Desp: 具体请求B</p>
 * <p>&nbsp;&nbsp; 该请求调用 action2</p>
 */
public class ConcreteCommandB extends Command {
    public ConcreteCommandB(Receiver reciever) {
        super(reciever);
    }

    @Override
    public void execute() {
        reciever.action2();
    }
}
