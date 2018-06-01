package cn.design.mode.factory.abstractt;

/**
 * Created by weicm on 2018/6/1.
 */
public interface IUserDao {
    boolean insert(User user);
    User select(Integer userId);
}
