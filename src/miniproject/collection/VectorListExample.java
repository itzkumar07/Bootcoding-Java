package miniproject.collection;

import java.util.Vector;
import static java.lang.System.*;


public class VectorListExample {
    public static void main(String[] args) {
        // 1. Create a Vector
        Vector<String> cities = new Vector<>();
        cities.add("Hyderabad");
        cities.add("Bangalore");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Pune");
        out.println("Initial List: " + cities);

        // 2. Add at a specific index
        cities.add(2, "Chennai");
        out.println("After adding Chennai at index 2: " + cities);

        // 3. Add at first and last position
        cities.add(0, "Kolkata");
        cities.add(cities.size(), "Jaipur");
        out.println("After adding first & last elements: " + cities);

        // 4. Get element at index 3
        out.println("Element at index 3: "+cities.get(3));

        // 5. Check if an element exists
        out.println(("Does the list contain Pune?"+cities.contains("Pune")));

        //6. Update element at index 4 
        cities.set(4,"Lucknow");
        out.println("After updating index 4: "+cities);

        //7. Remove by index & value
        cities.remove(4);
        cities.remove("Delhi");
        out.println("After removing elements: "+cities);

        //8. Iterate through the list

        for(String city : cities){
            out.println(city);
        }

        //9. Get the size
        out.println("List size: "+cities.size());    

        //10. Clear the list
        cities.clear();
        out.println("After clearing, is the list empty? "+cities.isEmpty());
    
    }
}

