package cn.design.pattern.bridge;

/**
 * <p>Created by weicm on 2018/7/6 14:43</p>
 * <p>Desp: 大分类</p>
 * <p>&nbsp;&nbsp; 品牌手机</p>
 */
public abstract class BrandPhone {
    protected PhoneSoft soft;

    public PhoneSoft getSoft() {
        return soft;
    }

    public void setSoft(PhoneSoft soft) {
        this.soft = soft;
    }
    public abstract void run();
}
