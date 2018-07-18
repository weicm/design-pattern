package cn.design.pattern.visitor;

/**
 * <p>Created by weicm on 2018/7/18 11:17</p>
 * <p>Desp: 具体访问者</p>
 * <p>&nbsp;&nbsp; 这里表示恋爱</p>
 */
public class Amativeness extends Action {
    public Amativeness() {
        super("恋爱");
    }

    @Override
    public void getManConclusion(Man man) {
        System.out.println(String.format("%s %s 时，凡事不懂也装懂！", man.desc, this.desc));
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(String.format("%s %s 时，遇事懂也装不懂！", woman.desc, this.desc));
    }
}
