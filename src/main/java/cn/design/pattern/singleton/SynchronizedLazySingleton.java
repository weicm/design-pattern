package cn.design.pattern.singleton;

/**
 * <p>Created by weicm on 2018/7/5 10:17</p>
 * <p>Desp: 懒汉式，同步代码块方式</p>
 * <p>&nbsp;&nbsp; 优先级： 4</p>
 */
public class SynchronizedLazySingleton {
    private static SynchronizedLazySingleton instance;

    private SynchronizedLazySingleton(){}
    public static synchronized SynchronizedLazySingleton getInstance() {
        if (null == instance) {
            instance = new SynchronizedLazySingleton();
        }
        return instance;
    }
}
