package cn.design.pattern.adapter;

/**
 * Created by weicm on 2018/6/29.
 */
public class AdapterDriver {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
