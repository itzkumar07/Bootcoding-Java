package dayeight.programs;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListElementsDataChcking {
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

        Field field = ArrayList.class.getDeclaredFields()[1];
        field.setAccessible(true);
        try {
            System.out.println(field.get(list));
        } catch (IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
