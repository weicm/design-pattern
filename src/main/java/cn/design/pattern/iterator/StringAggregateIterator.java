package cn.design.pattern.iterator;

/**
 * <p>Created by weicm on 2018/7/4 9:54</p>
 * <p>Desp: 具体迭代器</p>
 */
public class StringAggregateIterator implements Iterator<String> {
    private StringAggregate aggregate;
    private Integer index = 0;

    public StringAggregateIterator(StringAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public String first() {
        return aggregate.get(0);
    }

    @Override
    public String next() {
        return aggregate.get(index++);
    }

    @Override
    public Boolean isDone() {
        return index >= aggregate.len();
    }

    @Override
    public String currentItem() {
        return aggregate.get(index);
    }
}
