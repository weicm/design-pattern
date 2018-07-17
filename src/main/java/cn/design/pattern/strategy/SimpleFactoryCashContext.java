package cn.design.pattern.strategy;

/**
 * <p>Author: weicm</p>
 * <p>Date: 2018/3/23 14:34</p>
 * <p>Desp: 策略模式与简单工厂模式整合</p>
 */
public class SimpleFactoryCashContext {
    private CashSuper concreteCash;

    public SimpleFactoryCashContext(String strategy) {
        switch (strategy) {
            case "NORMAL":
                concreteCash = new CashNormal();
                break;
            case "REBATE":
                concreteCash = new CashRebate(0.5);
                break;
            case "RETURN":
                concreteCash = new CashReturn(300D, 100D);
                break;
            default:
                throw new RuntimeException("No this cash strategy!");
        }
    }

    public Double getResult(Double money) {
        return concreteCash.acceptCash(money);
    }
}
