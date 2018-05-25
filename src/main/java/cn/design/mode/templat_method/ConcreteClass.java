package cn.design.mode.templat_method;

/**
 * Created by weicm on 2018/5/25.
 */
public class ConcreteClass extends AbstractClass {
    @Override
    protected void primitiveOporation1() {
        System.out.println("特定实现方法1");
    }

    @Override
    protected void primitiveOporation2() {
        System.out.println("特定实现方法2");
    }
}
