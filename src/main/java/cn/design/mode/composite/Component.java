package cn.design.mode.composite;

/**
 * <p>Created by weicm on 2018/7/3 9:39</p>
 * <p>Desp: 抽象组件</p>
 * <p>&nbsp;&nbsp; 抽象组件，实现所有子类公有接口的默认行为；声明用于访问和管理子组件的接口</p>
 */
public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }


    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(Integer depth);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
