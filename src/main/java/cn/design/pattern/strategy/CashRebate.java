package cn.design.pattern.strategy;

/**
 * <p>Author: weicm</p>
 * <p>Date: 2018/3/23 14:14</p>
 * <p>Desp: 具体的策略，折扣收银</p>
 */
public class CashRebate extends CashSuper {
    private Double rebate;

    public CashRebate(Double rebate) {
        this.rebate = rebate;
    }

    @Override
    public Double acceptCash(Double money) {
        return money * rebate;
    }
}
