package dayseven.abstractarrayslistproject;

public class AbstractArraysListTwo extends AbstractArraysList {

    @Override
    void add(int i) {
    list.add(i);
    list1.add(i);
    }

    @Override
    void remove(int i) {
    list.remove(i);
    list.remove(i);
    }

    @Override
    void print() {
    list.add(2);
    list1.add(2);
    }
}

