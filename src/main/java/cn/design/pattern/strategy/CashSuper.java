package cn.design.pattern.strategy;

/**
 * <p>Author: weicm</p>
 * <p>Date: 2018/3/23 14:12</p>
 * <p>Desp: 抽象的策略，封装变化，具体的变化由具体的子类实现</p>
 */
public abstract class CashSuper {
    public abstract Double acceptCash(Double money);
}
