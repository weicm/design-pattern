package cn.design.mode.iterator;

/**
 * <p>Created by weicm on 2018/7/4 10:21</p>
 * <p>Desp: 迭代器模式</p>
 */
public class IteratorDriver {
    public static void main(String[] args) {
        StringAggregate sa = new StringAggregate(5);
        sa.add("a");
        sa.add("b");
        sa.add("c");
        sa.add("d");
        sa.add("e");

        Iterator<String> it = sa.createIterator();

        while (!it.isDone()) {
            String next = it.next();
            System.out.println(next);
        }

        System.out.println("Iterator is reatched to the bottom: " + it.isDone());
    }
}
