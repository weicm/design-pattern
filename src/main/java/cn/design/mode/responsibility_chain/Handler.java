package cn.design.mode.responsibility_chain;

/**
 * <p>Created by weicm on 2018/7/10 11:37</p>
 * <p>Desp: 抽象请求处理者</p>
 * <p>&nbsp;&nbsp; 可以访问后继者</p>
 */
public abstract class Handler {
    protected String name;
    protected Handler successor;

    public Handler(String name) {
        this.name = name;
    }

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle(Integer request);
}
