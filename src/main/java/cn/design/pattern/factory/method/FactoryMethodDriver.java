package cn.design.pattern.factory.method;

/**
 * Created by weicm on 2018/4/3.
 * <p>Desc: 工厂方法模式</p>
 * TODO 待总结
 */
public class FactoryMethodDriver {
    public static void main(String[] args) {
        Factorry factory = new DivFactory();
        Operation opt = factory.createOpration();
        opt.setNumberA(10D);
        opt.setNumberB(2.5D);
        System.out.println(opt.getResult());
    }
}
