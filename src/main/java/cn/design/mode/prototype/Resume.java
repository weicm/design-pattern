package cn.design.mode.prototype;

/**
 * Created by weicm on 2018/5/24.
 */
public class Resume implements Cloneable{
    private String name;
    private String sex;
    private int age;
    private Componey componey;

    public Resume(String name, String sex, int age, Componey componey) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.componey = componey;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", componey=" + componey +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Resume(this.name, this.sex, this.age, (Componey) this.componey.clone());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Componey getComponey() {
        return componey;
    }

    public void setComponey(Componey componey) {
        this.componey = componey;
    }
}
