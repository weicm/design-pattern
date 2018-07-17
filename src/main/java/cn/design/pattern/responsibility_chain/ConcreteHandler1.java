package cn.design.pattern.responsibility_chain;

/**
 * <p>Created by weicm on 2018/7/10 11:39</p>
 * <p>Desp: 具体请求处理者</p>
 */
public class ConcreteHandler1 extends Handler {


    public ConcreteHandler1(String name) {
        super(name);
    }

    @Override
    public void handle(Integer request) {
        if (request > 0 & request <= 10)
            System.out.println(String.format("%s处理了请求%d", name, request));
        else
            successor.handle(request);
    }
}
