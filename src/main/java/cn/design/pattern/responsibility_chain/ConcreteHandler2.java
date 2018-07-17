package cn.design.pattern.responsibility_chain;

/**
 * <p>Created by weicm on 2018/7/10 11:39</p>
 * <p>Desp: 具体请求处理者</p>
 */
public class ConcreteHandler2 extends Handler {


    public ConcreteHandler2(String name) {
        super(name);
    }

    @Override
    public void handle(Integer request) {
        if (request > 10 && request <= 20)
            System.out.println(String.format("%s处理了请求%d", name, request));
        else
            System.out.println(String.format("%s拒绝请求%d", name, request));
    }
}
