package dayseven.collections.comparatorpersonproject;

import java.util.*;
import static java.lang.System.*;

public class ComparatorPersonMain {
    public static void main(String[] args) {
        List<ComparatorPerson> people = Arrays.asList(
                new ComparatorPerson("Kumar", 22),
                new ComparatorPerson("Himanshu", 23),
                new ComparatorPerson("Dhiraj", 24),
                new ComparatorPerson("Adeeb", 25)
        );

        people.sort(Comparator.comparingInt(c -> c.age));

        // Print sorted list
        for (ComparatorPerson person : people) {
            out.println(person);
        }
    }
}
