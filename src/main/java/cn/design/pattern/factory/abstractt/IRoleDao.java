package cn.design.pattern.factory.abstractt;

/**
 * Created by weicm on 2018/6/1.
 */
public interface IRoleDao {
    boolean insert(Role role);
    Role select(Integer roleId);
}
