package cn.design.pattern.visitor;

/**
 * <p>Created by weicm on 2018/7/18 11:17</p>
 * <p>Desp: 具体访问者</p>
 * <p>&nbsp;&nbsp; 这里表示结婚</p>
 */
public class Marriage extends Action {
    public Marriage() {
        super("结婚");
    }

    @Override
    public void getManConclusion(Man man) {
        System.out.println(String.format("%s %s 时，感慨道：恋爱游戏终结时，有妻徒刑遥无期！", man.desc, this.desc));
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(String.format("%s %s 时，欣慰曰：爱情长跑路漫漫，婚姻保险保平安！", woman.desc, this.desc));
    }
}
