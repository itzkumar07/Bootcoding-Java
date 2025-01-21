package dayfifth.collection.list;


import java.util.ArrayList;

import static java.lang.System.*;

public class ArraysListSomeMethods {
    public void print(int i){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        out.println(list.get(i));
    }
}
