package cn.design.mode.decorator;

/**
 * Created by weicm on 2018/3/30.
 * <p>Desp: 具体的核心业务B</p>
 */
public class ComponentB implements Component {
    @Override
    public void opt() {
        System.out.println("ComponentB is me!");
    }
}
