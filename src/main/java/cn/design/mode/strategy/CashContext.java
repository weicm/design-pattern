package cn.design.mode.strategy;

/**
 * <p>Author: weicm</p>
 * <p>Date: 2018/3/23 14:15</p>
 * <p>Desp: 策略上下文，保存具体的策略的一个引用用，统一策略出口</p>
 */
public class CashContext {
    //具体策略
    private CashSuper concreteCash;

    public CashContext(CashSuper concreteCash) {
        this.concreteCash = concreteCash;
    }

    /**
     * <p>Author: weicm</p>
     * <p>Date: 2018/3/23 14:16</p>
     * <p>Desp: 统一策略出口</p>
     * @param money
     * @return
     */
    public Double getResult(Double money) {
        return concreteCash.acceptCash(money);
    }
}
