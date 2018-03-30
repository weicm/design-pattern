package cn.design.mode.decorator;

/**
 * Created by weicm on 2018/3/30.
 * <p>Desp: 装饰器X</p>
 */
public class DecoratorX extends Decorator{
    private String addField = "装配一个X属性";

    public DecoratorX(Component concreteComponent) {
        super(concreteComponent);
    }

    @Override
    public void opt() {
        System.out.println(addField);
        super.opt();
    }
}
