package cn.design.mode.templat_method;

/**
 * <p>Created by weicm on 2018/5/25 9:26</p>
 * <p>Desp: 模板方法模式</p>
 * <p>&nbsp;&nbsp; 定义一个操作中的算法骨架，而将一些步骤延迟到子类中。</p>
 * <p>&nbsp;&nbsp; 模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤</p>
 */
public class TemplateMethodDriver {
    public static void main(String[] args) {
        AbstractClass ac = new ConcreteClass();

        ac.templateMethod();
    }
}
