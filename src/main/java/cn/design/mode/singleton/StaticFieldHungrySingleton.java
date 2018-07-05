package cn.design.mode.singleton;

/**
 * <p>Created by weicm on 2018/7/5 10:15</p>
 * <p>Desp: 恶汉式，静态字段方式</p>
 * <p>&nbsp;&nbsp; 优先级： 5</p>
 * <p>&nbsp;&nbsp; 利用JMM内部的可见性机制保证 instance 正确发布</p>
 * <p>&nbsp;&nbsp; 静态字段和静态代码块，在类的加载阶段执行，而类的加载阶段有加锁操作，保证类被完整加载</p>
 */
public class StaticFieldHungrySingleton {
    private static StaticFieldHungrySingleton instance = new StaticFieldHungrySingleton();
    private StaticFieldHungrySingleton(){}
    public StaticFieldHungrySingleton getInstance() {
        return instance;
    }
}