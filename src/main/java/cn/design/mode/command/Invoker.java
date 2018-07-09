package cn.design.mode.command;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Created by weicm on 2018/7/9 10:58</p>
 * <p>Desp: 请求接收者和调用者</p>
 */
public class Invoker {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        //决定是否过滤请求
        commands.add(command);
        //记录日志
    }

    public boolean removeCommand(Command command) {
        return commands.remove(command);
    }

    public void execute() {
        for (Command command : commands) {
            //执行请求
            command.execute();
        }
    }
}
