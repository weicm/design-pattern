package cn.design.pattern.factory.abstractt;

/**
 * Created by weicm on 2018/6/1.
 */
public class PrestoRoleDao implements IRoleDao {
    @Override
    public boolean insert(Role role) {
        return false;
    }

    @Override
    public Role select(Integer roleId) {
        return null;
    }
}
