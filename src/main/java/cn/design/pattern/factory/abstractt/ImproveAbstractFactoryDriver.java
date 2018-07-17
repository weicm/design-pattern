package cn.design.pattern.factory.abstractt;

/**
 * <p>Created by weicm on 2018/6/1 9:58</p>
 * <p>Desp: 用简单工厂模式改进抽象工厂模式</p>
 * <p>&nbsp;&nbsp; DBAccess 替代掉 IDBFactory、MysqlFactory、PrestoFactory，类更少了</p>
 * <p>&nbsp;&nbsp; 客户端需要了解的只有 DBAccess 和 IRoleDao 以及 IUserDao，减少了2个</p>
 */
public class ImproveAbstractFactoryDriver {
    public static void main(String[] args) throws Exception{
        IRoleDao roleDao = DBAccess.createRoleDao();
        roleDao.insert(new Role());
        Role role = roleDao.select(1);
        System.out.println(role);
    }
}
