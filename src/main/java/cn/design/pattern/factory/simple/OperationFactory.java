package cn.design.pattern.factory.simple;

/**
 * <p>Author: weicm</p>
 * <p>Date: 2018/3/23 11:15</p>
 * <p>Desp: 简单工程</p>
 */
public class OperationFactory {
    public static Operation createOperation(String opt) {
        Operation operation = null;
        switch (opt) {
            case "+":
                operation = new AddOperation();
                break;
            case "/":
                operation = new AddOperation();
                break;
            default: operation = null;
        }
        return operation;
    }
}
