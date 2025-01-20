package dayfifth.collection.list;

import java.util.ArrayList;

public class InitialCapacityArray {
    int initialCapacity = 10;
    ArrayList<Integer> list = new ArrayList<>(initialCapacity);

    public void add(int i){
        list.add(i);
        System.out.println(list.size());
    }

    public void print(){
        for(int i : list){
            System.out.println(i);
        }
    }
}
