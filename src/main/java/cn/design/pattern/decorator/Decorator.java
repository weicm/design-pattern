package cn.design.pattern.decorator;

/**
 * Created by weicm on 2018/3/30.
 * 装饰器类
 */
public class Decorator implements Component {
    private Component concreteComponent;

    public Decorator(Component concreteComponent) {
        this.concreteComponent = concreteComponent;
    }

    @Override
    public void opt() {
        concreteComponent.opt();
    }
}
