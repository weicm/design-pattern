package cn.design.pattern.factory.abstractt;

/**
 * <p>Created by weicm on 2018/6/1 9:44</p>
 * <p>Desp: 典型抽象工厂模式</p>
 * <p>&nbsp;&nbsp; 客户端需要了解的类：IDBFactory、MysqlFactory、PrestoFactory、IUserDao、IUserDao</p>
 */
public class AbstractFactoryDriver {
    public static void main(String[] args) {
        IDBFactory mysqlFactory = new MysqlFactory();
        IUserDao userDao = mysqlFactory.createUserDao();
        userDao.insert(new User());
        userDao.select(1);
    }
}
