package cn.design.mode.bridge;

/**
 * <p>Created by weicm on 2018/7/6 14:51</p>
 * <p>Desp: 桥接模式</p>
 * <p>&nbsp;&nbsp; 这个模式的重点就是强调！ 不要什么都用继承，只有“is-a”关系是才用！</p>
 * <p>&nbsp;&nbsp; 本示例（品牌手机和软件）有点牵强，只是为了说明问题</p>
 */
public class BridgeDriver {
    public static void main(String[] args) {
        BrandPhone phone = new MPhone();
        Game soft = new Game();
        phone.setSoft(soft);
        phone.run();
    }
}
