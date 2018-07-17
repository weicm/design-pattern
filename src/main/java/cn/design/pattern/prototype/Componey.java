package cn.design.pattern.prototype;

/**
 * Created by weicm on 2018/5/24.
 */
public class Componey implements Cloneable{
    private String name;
    private String addr;

    public Componey(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Componey{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Componey(this.name, this.addr);
    }
}
