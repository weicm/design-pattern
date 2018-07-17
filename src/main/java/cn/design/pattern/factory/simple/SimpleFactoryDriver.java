package cn.design.pattern.factory.simple;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by weicm on 2018/3/23.
 * <p>Desp: 简单工厂模式</p>
 */
public class SimpleFactoryDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintStream out = System.out;
        out.print("Input NumberA: ");
        double numberA = Double.valueOf(scanner.next());

        out.print("Input opt: ");
        String opt = scanner.next();

        out.print("Input NumberB: ");
        double numberB = Double.valueOf(scanner.next());

        Operation operation = OperationFactory.createOperation(opt);
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        Double result = operation.getResult();

        out.format("Result: %s", result.toString());
    }
}
