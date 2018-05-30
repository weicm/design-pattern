package cn.design.mode.builder;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by weicm on 2018/5/30.
 */
public class Product {
    private List<String> parts = new LinkedList<>();
    public void addPart(String part) {
        parts.add(part);
    }
    public void show() {
        parts.forEach(part -> System.out.println("组件: " + part));
    }
}
