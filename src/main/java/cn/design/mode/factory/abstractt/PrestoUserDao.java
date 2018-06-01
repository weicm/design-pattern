package cn.design.mode.factory.abstractt;

/**
 * Created by weicm on 2018/6/1.
 */
public class PrestoUserDao implements IUserDao {
    @Override
    public boolean insert(User user) {
        return false;
    }

    @Override
    public User select(Integer userId) {
        return null;
    }
}
