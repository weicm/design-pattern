package cn.design.pattern.composite;

/**
 * <p>Created by weicm on 2018/7/3 9:46</p>
 * <p>Desp: 叶子结点</p>
 * <p>&nbsp;&nbsp; 叶子结点，没有子节点，没有add、remove方法，只有display方法</p>
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        throw new RuntimeException("不支持该操作！");
    }

    @Override
    public void remove(Component component) {
        throw new RuntimeException("不支持该操作！");
    }

    @Override
    public void display(Integer depth) {
        System.out.println(String.format("%0"+depth+"d  :  %s", 0, getName()).replaceAll("0", "-"));
    }
}
