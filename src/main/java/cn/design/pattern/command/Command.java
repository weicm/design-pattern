package cn.design.pattern.command;

/**
 * <p>Created by weicm on 2018/7/9 10:57</p>
 * <p>Desp: 命令接口</p>
 */
public abstract class Command {
    protected Receiver reciever;

    public Command(Receiver reciever) {
        this.reciever = reciever;
    }

    public abstract void execute();
}
