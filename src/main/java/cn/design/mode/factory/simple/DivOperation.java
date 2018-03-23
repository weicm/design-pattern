package cn.design.mode.factory.simple;

/**
 * <p>Author: weicm</p>
 * <p>Date: 2018/3/23 11:15</p>
 * <p>Desp: 工厂实例：除法操作</p>
 */
public class DivOperation extends Operation {
    @Override
    public Double getResult() {
        return getNumberA() / getNumberB();
    }
}