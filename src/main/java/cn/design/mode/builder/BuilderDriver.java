package cn.design.mode.builder;

/**
 * <p>Created by weicm on 2018/5/30 9:58</p>
 * <p>Desp: 建造者模式</p>
 */
public class BuilderDriver {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.constructProduct();
        product.show();
    }
}
