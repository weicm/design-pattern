package cn.design.pattern.facade;

/**
 * Created by weicm on 2018/5/29.
 */
public class Facade {
    private SubsystemOne subsystemOne;
    private SubsystemTwo subsystemTwo;
    private SubsystemThree subsystemThree;
    private SubsystemFour subsystemFour;

    public Facade() {
        this.subsystemOne = new SubsystemOne();
        this.subsystemTwo = new SubsystemTwo();
        this.subsystemThree = new SubsystemThree();
        this.subsystemFour = new SubsystemFour();
    }

    public void methodA() {
        System.out.println("方法组A");
        subsystemOne.methodOne();
        subsystemTwo.methodTwo();
        subsystemFour.methodFour();
    }

    public void methodB() {
        System.out.println("方法组B");
        subsystemTwo.methodTwo();
        subsystemThree.methodThree();
    }
}
