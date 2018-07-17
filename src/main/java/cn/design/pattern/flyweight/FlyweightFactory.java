package cn.design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Created by weicm on 2018/7/12 10:20</p>
 * <p>Desp: 享元工厂</p>
 * <p>&nbsp;&nbsp; 享元工厂，用来创建并管理 Flyweight 对象。它主要用来确保合理地共享Flyweight对象，当用户请求一个 Flyweight对象时，它提供一 个已经创建好的实例或者创建一个（如果不存 在的话）</p>
 */
public class FlyweightFactory {
    private static Map<String, Flyweight> flyweights = new HashMap<>();

    public static Flyweight getFlyweight(String key) {
        Flyweight f = flyweights.get(key);
        if (null == f) {
            f = new SharedFlyweight(key);
            flyweights.put(key, f);
        }
        return f;
    }

    /**
     * <p>Created by weicm on 2018/7/12 10:44</p>
     * <p>Desp: 获取享元对象数量</p>
     * <p>&nbsp;&nbsp; 该方法用户打印数量，具体应用享元模式是可以没有该方法</p>
     *
     * @return 共享享元对象个数
     */
    public static Integer getSize() {
        return flyweights.size();
    }

}
