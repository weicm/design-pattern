package cn.design.pattern.proxy;

/**
 * Created by weicm on 2018/3/30.
 * <p>Desp: 代理对象，负责创建对象，封装对象（客户不需要了解被封装对象），并提供对象的功能</p>
 */
public class Proxy implements Subject {
    private Subject realSubject;

    public Proxy() {
        this.realSubject = new RealSubject();
    }

    @Override
    public void show() {
        System.out.println("Do something before ");
        realSubject.show();
        System.out.println("Do something after ");
    }
}
