package cn.design.pattern.visitor;

/**
 * <p>Created by weicm on 2018/7/18 11:13</p>
 * <p>Desp: 具体访问者</p>
 * <p>&nbsp;&nbsp; 这里表示成功</p>
 */
public class Success extends Action {
    public Success() {
        super("成功");
    }

    @Override
    public void getManConclusion(Man man) {
        System.out.println(String.format("%s %s 时，背后多半有一个伟大的女人！", man.desc, this.desc));
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(String.format("%s %s 时，背后多半有一个不成功的那人！", woman.desc, this.desc));
    }
}
