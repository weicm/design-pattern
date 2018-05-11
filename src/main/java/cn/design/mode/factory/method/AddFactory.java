package cn.design.mode.factory.method;

/**
 * Created by weicm on 2018/4/3.
 */
public class AddFactory implements Factorry {
    @Override
    public Operation createOpration() {
        return new AddOperation();
    }
}
