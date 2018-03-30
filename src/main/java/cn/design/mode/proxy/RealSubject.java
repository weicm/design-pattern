package cn.design.mode.proxy;

/**
 * Created by weicm on 2018/3/30.
 * <p>Desp: 真实对象</p>
 */
public class RealSubject implements Subject {
    @Override
    public void show() {
        System.out.println("Take a showing!");
    }
}
