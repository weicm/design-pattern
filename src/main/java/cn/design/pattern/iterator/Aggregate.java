package cn.design.pattern.iterator;

/**
 * <p>Created by weicm on 2018/7/4 9:50</p>
 * <p>Desp: 抽象聚集</p>
 */
public interface Aggregate<T> {
    Iterator<T> createIterator();
}
