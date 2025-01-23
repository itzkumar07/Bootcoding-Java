package dayeight.taskone;

import java.util.ArrayList;
import static java.lang.System.*;

public class ArrayListForLoop {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");
        list.add("Is");
        list.add("Awesome");

        out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        out.println(list1);

        // Using for-each loop
        out.println("\nCheck 1:");
        for (int element : list1) {
            if (element == 1) {
                out.println("True");
            } else {
                out.println("False");
            }
        }

        out.println("\nCheck 6:");
        boolean found3 = false; // To simulate the 'break' behavior in a for-each loop
        for (int element : list1) {
            if (element == 3) {
                out.println("True");
                found3 = true;
                break;
            } else {
                out.println("False");
            }
        }


        if (!found3) out.println("3 not found");

        out.println("\nCheck 2:");
        for (int element : list1) {
            if (element == 2) {
                out.println("True");
                break;
            }
        }
    }
}

