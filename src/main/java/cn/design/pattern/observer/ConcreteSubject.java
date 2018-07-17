package cn.design.pattern.observer;

/**
 * Created by weicm on 2018/5/31.
 */
public class ConcreteSubject extends Subject{
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
