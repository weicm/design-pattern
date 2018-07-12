package cn.design.mode.flyweight;

/**
 * <p>Created by weicm on 2018/7/12 10:27</p>
 * <p>Desp: 不共享的具体享元类</p>
 * <p>&nbsp;&nbsp; 所有状态都可以放在类的内部维护，而不需要响应外部状态</p>
 */
public class UnSharedFlyweight extends Flyweight {
    private String innerState1;
    private String innerState2;

    public String getInnerState1() {
        return innerState1;
    }

    public void setInnerState1(String innerState1) {
        this.innerState1 = innerState1;
    }

    public String getInnerState2() {
        return innerState2;
    }

    public void setInnerState2(String innerState2) {
        this.innerState2 = innerState2;
    }

    public UnSharedFlyweight() {
        super("UNSHARED");
    }

    /**
     * <p>Created by weicm on 2018/7/12 10:20</p>
     * <p>Desp: 作用外部状态</p>
     * <p>&nbsp;&nbsp; 不共享的享元类，可以不支持该方法</p>
     *
     * @param extrinsicState 外部状态
     */
    @Override
    public void opration(Integer extrinsicState) {
        throw new RuntimeException("不支持该操作！");
    }
}
