package cn.design.pattern.visitor;

/**
 * <p>Created by weicm on 2018/7/18 11:40</p>
 * <p>Desp: 访问者模式</p>
 */
public class VisitorDriver {
    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        ds.add(new Man());
        ds.add(new Woman());

        //成功
        ds.accept(new Success());
        //失败
        ds.accept(new Falling());
        //恋爱
        ds.accept(new Amativeness());
        //结婚
        ds.accept(new Marriage());

    }
}
