package cn.design.mode.factory.simple;

/**
 * <p>Author: weicm</p>
 * <p>Date: 2018/3/23 11:16</p>
 * <p>Desp: 操作接口</p>
 * <p>应用面向对象的多态特性</p>
 */
public abstract class Operation {
    private Double numberA;
    private Double numberB;

    public abstract Double getResult();

    public Double getNumberA() {
        return numberA;
    }

    public void setNumberA(Double numberA) {
        this.numberA = numberA;
    }

    public Double getNumberB() {
        return numberB;
    }

    public void setNumberB(Double numberB) {
        this.numberB = numberB;
    }
}
