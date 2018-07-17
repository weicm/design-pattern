package cn.design.pattern.adapter;

/**
 * <p>Created by weicm on 2018/6/29 9:36</p>
 * <p>Desp: 适配器</p>
 * <p>&nbsp;&nbsp; 适配器，集成目标接口，通过在内部包装一个被适 配对象（Adaptee），把原有接口转换成目标接口</p>
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        System.out.println("适配--------");
        adaptee.specificRequest();
        System.out.println("--------适配");
    }
}
