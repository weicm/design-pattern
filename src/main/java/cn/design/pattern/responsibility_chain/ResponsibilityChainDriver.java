package cn.design.pattern.responsibility_chain;

/**
 * <p>Created by weicm on 2018/7/10 11:45</p>
 * <p>Desp: 职责链模式</p>
 */
public class ResponsibilityChainDriver {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1("经理");
        Handler h2 = new ConcreteHandler2("总经理");
        h1.setSuccessor(h2);

        Integer[] reqs = {2, 10, 33, 18, 5};

        for (Integer req : reqs) {
            h1.handle(req);
        }
    }
}
