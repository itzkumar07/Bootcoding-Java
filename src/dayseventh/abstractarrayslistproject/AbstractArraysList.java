package dayseventh.abstractarrayslistproject;

import java.util.ArrayList;

abstract class AbstractArraysList {
    abstract void add(int i);
    abstract void remove(int i);
    abstract void print();

    static ArrayList<Integer> list = new java.util.ArrayList<>( );
    static ArrayList<Integer> list1 = new java.util.ArrayList<>();
}
