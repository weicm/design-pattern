package cn.design.pattern.builder;

/**
 * Created by weicm on 2018/5/30.
 */
public interface Builder {
    void buildPartA();
    void buildPartB();
    Product getProduct();
}
