package cn.design.mode.state;

/**
 * <p>Created by weicm on 2018/6/27 9:26</p>
 * <p>Desp: 抽象状态类</p>
 * <p>&nbsp;&nbsp; 抽象状态类，定义一个 接口以封装与 Context 的一个特定状态相关的行为 </p>
 */
public abstract class State {
    //用户存储具体状态数据的属性字段
    private String status;

    /**
     * <p>Created by weicm on 2018/6/27 9:35</p>
     * <p>Desp: 封装当前状态的具体行为，有必要的话，需要转入下一状态</p>
     *
     * @param ctx 上下文对象
     */
    public abstract void handle(Context ctx);

    public State(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
