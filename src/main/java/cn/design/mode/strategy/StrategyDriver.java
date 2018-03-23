package cn.design.mode.strategy;

/**
 * <p>Author: weicm</p>
 * <p>Date: 2018/3/23 14:11</p>
 * <p>Desp: 策略模式</p>
 * <p>&nbsp;&nbsp;&nbsp;&nbsp; 策略模式是一种定义一系列算法的方法</p>
 * <p>&nbsp;&nbsp;&nbsp;&nbsp; 从概念上来看，所有这些算法完成的都是相同的工作，只是实现不同</p>
 * <p>&nbsp;&nbsp;&nbsp;&nbsp; 它可以以相同的方式调用所有的算法，减少了各种算法类与使用类之间的耦合</p>
 */
public class StrategyDriver {
    public static void main(String[] args) {
        //策略模式
        CashContext context = new CashContext(new CashRebate(0.5));
        System.out.println(context.getResult(9999D));

        /**
         * <p>Desp: 策略模式与简单工厂模式结合</p>
         * <p>&nbsp;&nbsp;&nbsp;&nbsp; 可以暴露更少的类给客户端，降低代码耦合性</p>
         */
        SimpleFactoryCashContext sfContext = new SimpleFactoryCashContext("REBATE");
        System.out.println(sfContext.getResult(9999D));
    }
}
