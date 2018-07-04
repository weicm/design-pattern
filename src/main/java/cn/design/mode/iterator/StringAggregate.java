package cn.design.mode.iterator;

/**
 * <p>Created by weicm on 2018/7/4 9:53</p>
 * <p>Desp: 具体聚集</p>
 * <p>&nbsp;&nbsp; 这里是字符串聚集</p>
 */
public class StringAggregate implements Aggregate<String> {
    private String[] strs;
    private Integer index = 0;
    public StringAggregate(Integer capacity) {
        strs = new String[capacity];
    }

    public void add(String item) {
        strs[index++] = item;
    }

    public String remove() {
        String last = strs[index];
        strs[index] = null;
        return last;
    }

    public String get(Integer index) {
        return strs[index];
    }
    public Integer index() {
        return index;
    }

    public Integer len() {
        return strs.length;
    }
    @Override
    public Iterator<String> createIterator() {
        return new StringAggregateIterator(this);
    }
}
