package cn.design.pattern.singleton;

/**
 * <p>Created by weicm on 2018/7/5 10:24</p>
 * <p>Desp: 懒汉式，静态内部类方式</p>
 * <p>&nbsp;&nbsp; 优先级： 2</p>
 */
public class StaticInnerClassLazySingleton {
    private static class SingletonHoder {
        private static final StaticInnerClassLazySingleton instance = new StaticInnerClassLazySingleton();
    }

    private StaticInnerClassLazySingleton(){}
    public static StaticInnerClassLazySingleton getInstance() {
        return SingletonHoder.instance;
    }
}
