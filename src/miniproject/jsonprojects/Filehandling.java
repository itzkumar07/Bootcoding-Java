package miniproject.jsonprojects;

import org.json.JSONObject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.System.*;


public class Filehandling {
    public static void main(String[] args) {
        try {
            // Step 1: Read JSON file using Scanner
            File file = new File("C:\\Users\\kumar\\IdeaProjects\\Bootcoding-Java\\src\\miniproject\\jsonprojects\\data.json");
            Scanner scanner = new Scanner(file);
            StringBuilder jsonData = new StringBuilder();

            while (scanner.hasNextLine()) {
                jsonData.append(scanner.nextLine());
            }
            scanner.close();

            // Step 2: Parse JSON
            JSONObject jsonObject = new JSONObject(jsonData.toString());

            // Step 3: Extract values
            String name = jsonObject.getString("name");
            int age = jsonObject.getInt("age");
            String city = jsonObject.getString("city");

            // Step 4: Display JSON values
            out.println("Name: " + name);
            out.println("Age: " + age);
            out.println("City: " + city);

        }   catch (FileNotFoundException e) {
            out.println("Error: JSON file not found!");
        }
    }
}