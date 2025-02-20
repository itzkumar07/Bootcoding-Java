// package miniproject.collection;

import java.util.ArrayList;
import static java.lang.System.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        //1. adding the fruits
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Cherry");

        //2. print the list
        out.println("This Fruits list "+fruits);

        //3. access elements
        out.println("Third fruts "+fruits.get(2));

        //4. update elements
        fruits.set(3,"Grapes");
        out.println(fruits);

        //5. remove elements by value
        fruits.remove(0);
        out.println(fruits);

        //6. remove element by value
        fruits.remove(2);
        out.println(fruits);

        //check the element is present or not
        out.println("contains apple ? "+ fruits.contains("apple"));

        //print the values by iterating
        for (String object : fruits){
            out.println(object);
        }

        // getting the size
        out.println("Size of fruits list "+ fruits.size());

        // clear the list
        fruits.clear();
        out.println("List is empty or not "+ fruits.isEmpty());
    }
}