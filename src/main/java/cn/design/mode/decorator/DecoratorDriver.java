package cn.design.mode.decorator;

/**
 * Created by weicm on 2018/3/30.
 * <p>Desp: </p>
 */
public class DecoratorDriver {
    public static void main(String[] args) {
        Component ca = new ComponentA();
        Component cb = new ComponentB();

        Component xca = new DecoratorX(ca);
        xca.opt();

        System.out.println("========================================");
        Component yxca = new DecoratorY(xca);
        yxca.opt();
    }
}
