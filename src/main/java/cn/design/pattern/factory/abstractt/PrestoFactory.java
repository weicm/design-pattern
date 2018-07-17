package cn.design.pattern.factory.abstractt;

/**
 * Created by weicm on 2018/6/1.
 */
public class PrestoFactory implements IDBFactory {
    @Override
    public IUserDao createUserDao() {
        return null;
    }

    @Override
    public IRoleDao createRoleDao() {
        return null;
    }
}
