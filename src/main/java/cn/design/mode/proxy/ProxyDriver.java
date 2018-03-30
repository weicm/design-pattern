package cn.design.mode.proxy;

/**
 * Created by weicm on 2018/3/30.
 * <p>Desp: 代理模式</p>
 * <p>代理模式 VS 装饰模式：</p>
 * <p>&nbsp;&nbsp;&nbsp;&nbsp; 装饰模式：动态 多次性 修饰 封装对象</p>
 * <p>&nbsp;&nbsp;&nbsp;&nbsp; 代理模式：静态 一次性 增强 封装对象</p>
 */
public class ProxyDriver {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.show();
    }
}
