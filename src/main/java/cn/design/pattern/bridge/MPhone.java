package cn.design.pattern.bridge;

/**
 * <p>Created by weicm on 2018/7/6 14:50</p>
 * <p>Desp: 大分类</p>
 * <p>&nbsp;&nbsp; M品牌的手机</p>
 */
public class MPhone extends BrandPhone {
    @Override
    public void run() {
        soft.run();
    }
}
