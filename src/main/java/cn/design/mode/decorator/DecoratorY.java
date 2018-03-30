package cn.design.mode.decorator;

/**
 * Created by weicm on 2018/3/30.
 * <p>Desp: 装饰器Y</p>
 */
public class DecoratorY extends Decorator {
    public DecoratorY(Component concreteComponent) {
        super(concreteComponent);
    }

    @Override
    public void opt() {
        addMethod();
        super.opt();
    }

    private void addMethod() {
        System.out.println("新增功能Y!");
    }
}
