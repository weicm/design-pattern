package cn.design.mode.flyweight;

/**
 * <p>Created by weicm on 2018/7/12 10:27</p>
 * <p>Desp: 共享的具体享元类</p>
 * <p>&nbsp;&nbsp; 维护共享的内部状态</p>
 */
public class SharedFlyweight extends Flyweight {
    private String innerState;

    public String getInnerState() {
        return innerState;
    }

    public void setInnerState(String innerState) {
        this.innerState = innerState;
    }

    public SharedFlyweight(String category) {
        super(category);
    }

    /**
     * <p>Created by weicm on 2018/7/12 10:20</p>
     * <p>Desp: 作用外部状态</p>
     *
     * @param extrinsicState 外部状态
     */
    @Override
    public void opration(Integer extrinsicState) {
        System.out.println(String.format("共享享元（%s）收到外部状态: %d", category, extrinsicState));
    }
}
