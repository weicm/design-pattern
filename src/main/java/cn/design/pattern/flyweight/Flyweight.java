package cn.design.pattern.flyweight;

/**
 * <p>Created by weicm on 2018/7/12 10:17</p>
 * <p>Desp: </p>
 * <p>&nbsp;&nbsp; 抽象享元类，可以接受并作用于外部状态</p>
 */
public abstract class Flyweight {
    protected String category;

    public Flyweight(String category) {
        this.category = category;
    }

    /**
     * <p>Created by weicm on 2018/7/12 10:20</p>
     * <p>Desp: 作用外部状态</p>
     *
     * @param extrinsicState 外部状态
     */
    public abstract void opration(Integer extrinsicState);
}
