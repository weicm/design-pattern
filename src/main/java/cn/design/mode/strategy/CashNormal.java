package cn.design.mode.strategy;

/**
 * <p>Author: weicm</p>
 * <p>Date: 2018/3/23 14:13</p>
 * <p>Desp: 具体的策略，正常收银</p>
 */
public class CashNormal extends CashSuper {
    @Override
    public Double acceptCash(Double money) {
        return money;
    }
}
