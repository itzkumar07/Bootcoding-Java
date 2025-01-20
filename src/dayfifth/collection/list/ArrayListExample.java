package dayfifth.collection.list;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Display all elements in the ArrayList
        System.out.println("Fruits: " + fruits);

        // Access an element
        System.out.println("First fruit: " + fruits.get(0));

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Update an element
        fruits.set(1, "Orange");
        System.out.println("After updating Mango to Orange: " + fruits);

        // Check size of the ArrayList
        System.out.println("Total fruits: " + fruits.size());
    }

}
