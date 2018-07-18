package cn.design.pattern.visitor;

/**
 * <p>Created by weicm on 2018/7/18 11:17</p>
 * <p>Desp: 具体访问者</p>
 * <p>&nbsp;&nbsp; 这里表示失败</p>
 */
public class Falling extends Action {
    public Falling() {
        super("失败");
    }

    @Override
    public void getManConclusion(Man man) {
        System.out.println(String.format("%s %s 时，闷头喝酒，谁也不用劝！", man.desc, this.desc));
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(String.format("%s %s 时，眼泪汪汪，谁也劝不了！", woman.desc, this.desc));
    }
}
