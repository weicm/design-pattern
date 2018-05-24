package cn.design.mode.prototype;

/**
 * Created by weicm on 2018/5/24.
 */
public class PrototypeDriver {
    public static void main(String[] args) throws Exception {
        Resume r1 = new Resume("weicm", "man", 18, new Componey("julong", "中关村软件园"));
        Resume r2 = (Resume) r1.clone();
        r2.setName("weichangmign");
        r2.setSex("MAN");
        r2.setAge(30);
        r2.getComponey().setName("yaxin");

        System.out.println(r1);
        System.out.println(r2);
    }
}
