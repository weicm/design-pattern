package cn.design.pattern.singleton;

/**
 * <p>Created by weicm on 2018/7/5 10:30</p>
 * <p>Desp: 懒汉式，枚举方式</p>
 * <p>&nbsp;&nbsp; 优先级： 1</p>
 * <p>&nbsp;&nbsp; 防止多次实例化，即使是在面对复杂的序列化或者反射攻击的时候(安全)！</p>
 * <p>&nbsp;&nbsp; TODO 该方式同样适用了 JMM 的内部可见性机制，还有待研究</p>
 */
public enum EnumLazySingleton {
    instance;
}
