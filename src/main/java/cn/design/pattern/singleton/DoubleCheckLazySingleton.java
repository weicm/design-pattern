package cn.design.pattern.singleton;

/**
 * <p>Created by weicm on 2018/7/5 10:32</p>
 * <p>Desp: 懒汉式，双重校验方式</p>
 * <p>&nbsp;&nbsp; 优先级： 3</p>
 * <p>引用《Java 并发编程实战》中的话：</p>
 * <p>&nbsp;&nbsp; 促使该模式出现的驱动力（无竞争同步的执行速度很慢，以及 JVM 启动时很慢）已经不复存在了，因而它不是一种高效的优化措施。</p>
 * <p>&nbsp;&nbsp; 静态内部类方式（占位类模式）能带来同样的优势，并且更容易理解</p>
 */
public class DoubleCheckLazySingleton {
    //此处要加 volatile 关键字修饰 instance，保证实例化不会重排序到赋值指令之后
    private static volatile DoubleCheckLazySingleton instance;

    private DoubleCheckLazySingleton() {}
    public static DoubleCheckLazySingleton getInstance() {
        //如果没有加 volatile 修饰，这个时候第一个 if 校验由与没有同步，可能督导 instance 引用不为空，但是 instance 的内部状态可能还没初始化完成
        if (null == instance) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (null == instance) {
                    //如果不用 volatile 修饰instance，new DoubleCheclSingleton() 的执行可能会被重排序到赋值操作 instance = new DoubleCheclSingleton() 之后
                    instance = new DoubleCheckLazySingleton();
                }
            }
        }
        return instance;
    }
}
