package dayseven.collections;

import java.util.ArrayList;
import static java.lang.System.*;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Kumar");

        out.println(list.get(1));

        for(String s : list){
            out.println(s);
        }
    }
}
