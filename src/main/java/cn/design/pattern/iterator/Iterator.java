package cn.design.pattern.iterator;

/**
 * <p>Created by weicm on 2018/7/4 9:46</p>
 * <p>Desp: 迭代器</p>
 * <p>&nbsp;&nbsp; 迭代器接口，用于定义得到 开始对象、的到下一个对象、判断是否到结尾、当前对象等抽象方法</p>
 */
public interface Iterator<T> {
    T first();
    T next();
    Boolean isDone();
    T currentItem();
}
