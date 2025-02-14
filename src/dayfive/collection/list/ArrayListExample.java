package dayfive.collection.list;

import java.util.ArrayList;
import static java.lang.System.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Display all elements in the ArrayList
        out.println("Fruits: " + fruits);

        // Access an element
        out.println("First fruit: " + fruits.getFirst());

        // Remove an element
        fruits.remove("Banana");
        out.println("After removing Banana: " + fruits);

        // Update an element
        fruits.set(1, "Orange");
        out.println("After updating Mango to Orange: " + fruits);

        // Check size of the ArrayList
        out.println("Total fruits: " + fruits.size());
    }
}
