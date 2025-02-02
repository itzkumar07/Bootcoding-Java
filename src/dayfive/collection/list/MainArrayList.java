package dayfive.collection.list;

import java.util.ArrayList;
import static java.lang.System.*;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello"); //size 1
        list.add("World"); //size 2
        for(String s : list){
            out.println(s);
        }
        out.println(list.size()); // all Size printing
    }
}
