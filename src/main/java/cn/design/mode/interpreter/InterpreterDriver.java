package cn.design.mode.interpreter;

/**
 * <p>Created by weicm on 2018/7/14 11:49</p>
 * <p>Desp: 解释器模式</p>
 */
public class InterpreterDriver {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.calculate("1 + 2 * 3 + ( 4 + ( 5 + 2 ) / 10 )"));
        System.out.println(c.calculate("3 * ( 5 + 10 ) / 2"));
    }
}
