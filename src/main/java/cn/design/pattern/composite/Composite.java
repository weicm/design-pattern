package cn.design.pattern.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * <p>Created by weicm on 2018/7/3 9:47</p>
 * <p>Desp: 分支节点（复合节点）</p>
 * <p>&nbsp;&nbsp; 分支节点（或复合节点），用来存储子组件；实现与子组件有关的所有操作add、 remove、display</p>
 */
public class Composite extends Component {
    private List<Component> subs = new LinkedList<>();
    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        subs.add(component);
    }

    @Override
    public void remove(Component component) {
        subs.remove(component);
    }

    @Override
    public void display(Integer depth) {
        System.out.println(String.format("%0"+depth+"d  :  %s", 0, getName()).replaceAll("0", "-"));
        subs.forEach(sub -> {
            sub.display(depth + 4);
        });
    }
}
