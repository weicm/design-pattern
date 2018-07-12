package cn.design.mode.flyweight;

/**
 * <p>Created by weicm on 2018/7/12 10:35</p>
 * <p>Desp: 享元模式</p>
 */
public class FlyweightDriver {
    public static void main(String[] args) {
        //外部状态
        int extrinsicSate = 100;
        Flyweight sfa = FlyweightFactory.getFlyweight("SHARED-A");
        sfa.opration(extrinsicSate--);

        Flyweight sfb = FlyweightFactory.getFlyweight("SHARED-B");
        sfb.opration(extrinsicSate--);

        Flyweight sfc = FlyweightFactory.getFlyweight("SHARED-A");
        sfc.opration(extrinsicSate--);

        Flyweight sfa2 = FlyweightFactory.getFlyweight("SHARED-A");
        sfa2.opration(extrinsicSate--);

        UnSharedFlyweight unsf = new UnSharedFlyweight();
        unsf.setInnerState1("a");
        unsf.setInnerState2("b");

        System.out.println("共享对象数量：" + FlyweightFactory.getSize());
    }
}
