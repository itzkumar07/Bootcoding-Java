package dayeight.programs;

import java.util.ArrayList;
import static java.lang.System.*;

public class ArrayListElementsDataChecking {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(11);
        list.add(10);
        list.add(23);
        list.add(67);
        list.add(100);
        list.add(1000);
        list.add(10000);
        list.add(100000);
        list.add(1000000);
        list.add(10000000);

       out.println("Size of the list: " + list.get(2));
    }
}
