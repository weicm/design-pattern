package cn.design.pattern.strategy;

/**
 * <p>Author: weicm</p>
 * <p>Date: 2018/3/23 14:14</p>
 * <p>Desp: 具体的策略，达标返现收银</p>
 */
public class CashReturn extends CashSuper{
    private Double moneyCondition;
    private Double moneyRreturn;

    public CashReturn(Double moneyCondition, Double moneyRreturn) {
        this.moneyCondition = moneyCondition;
        this.moneyRreturn = moneyRreturn;
    }

    @Override
    public Double acceptCash(Double money) {
        return money - Math.floor((money / moneyCondition)) * moneyRreturn;
    }
}
