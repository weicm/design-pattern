package cn.design.pattern.builder;

/**
 * Created by weicm on 2018/5/30.
 */
public class ConcreteBuilder implements Builder {
    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.addPart("X");
    }

    @Override
    public void buildPartB() {
        product.addPart("Y");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
