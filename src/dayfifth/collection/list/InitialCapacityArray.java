package dayfifth.collection.list;

import java.util.ArrayList;
import static java.lang.System.*;

public class InitialCapacityArray {
    int initialCapacity = 10;

    ArrayList<Integer> list = new ArrayList<>(initialCapacity);

    public void add(int i){
        list.add(i);
        out.println(list.size());
    }

    public void print(){
        for(int i : list){
            out.println(i);
        }
    }

    public static void Data( int i){
        if(i<100){
            Data(i+1);
        }
    }
}
