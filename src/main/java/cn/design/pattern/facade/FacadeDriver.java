package cn.design.pattern.facade;

/**
 * Created by weicm on 2018/5/29.
 */
public class FacadeDriver {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
