package cn.design.mode.factory.abstractt;

/**
 * <p>Created by weicm on 2018/6/1 9:55</p>
 * <p>Desp: 简单工厂改进抽象工厂</p>
 * <p>&nbsp;&nbsp; DBAccess 替代掉 IDBFactory、MysqlFactory、PrestoFactory</p>
 * <p>&nbsp;&nbsp; 客户端需要了解的类：DBAccess、IUserDao、IUserDao</p>
 */
public class DBAccess {
    //该属性可以从配置文件读取
    private static String DB_TYPE = "Mysql";

    public static IUserDao createUserDao() throws Exception {
        String className = DB_TYPE + "UserDao";
        return (IUserDao) Class.forName(className).newInstance();
    }
    public static IRoleDao createRoleDao()  throws Exception {
        String className = DB_TYPE + "RoleDao";
        return (IRoleDao) Class.forName(className).newInstance();
    }
}
