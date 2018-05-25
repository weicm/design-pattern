package cn.design.mode.templat_method;

/**
 * <p>Created by weicm on 2018/5/25 9:23</p>
 * <p>Desp: 模板方法模式</p>
 */
public abstract class AbstractClass {
    /**
     * <p>Created by weicm on 2018/5/25 9:23</p>
     * <p>Desp: 模板方法</p>
     */
    public void templateMethod() {
        primitiveOporation1();
        primitiveOporation2();
        System.out.println("Template method mode!");
    }

    /**
     * <p>Created by weicm on 2018/5/25 9:24</p>
     * <p>Desp: 用于模板逻辑的抽象方法1</p>
     */
    protected abstract void primitiveOporation1();

    /**
     * <p>Created by weicm on 2018/5/25 9:24</p>
     * <p>Desp: 用于模板逻辑的抽象方法2</p>
     */
    protected abstract void primitiveOporation2();
}
