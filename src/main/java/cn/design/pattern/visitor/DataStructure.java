package cn.design.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Created by weicm on 2018/7/18 11:26</p>
 * <p>Desp: 数据结构</p>
 */
public class DataStructure {
    private List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        persons.add(person);
    }

    public void remove(Person person) {
        persons.remove(person);
    }

    public void accept(Action action) {
        for (Person p : persons) {
            p.accept(action);
        }
    }
}
