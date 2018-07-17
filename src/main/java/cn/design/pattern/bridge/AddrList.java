package cn.design.pattern.bridge;

/**
 * <p>Created by weicm on 2018/7/6 14:48</p>
 * <p>Desp: 具体小分类</p>
 * <p>&nbsp;&nbsp; 手机通讯录</p>
 */
public class AddrList extends PhoneSoft{
    @Override
    public void run() {
        System.out.println("运行手机通讯录");
    }
}
