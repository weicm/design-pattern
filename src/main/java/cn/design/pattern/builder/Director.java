package cn.design.pattern.builder;

/**
 * Created by weicm on 2018/5/30.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product constructProduct() {
        builder.buildPartA();
        builder.buildPartB();
        return builder.getProduct();
    }
}
