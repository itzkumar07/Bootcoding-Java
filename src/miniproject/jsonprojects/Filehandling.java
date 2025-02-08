package miniproject.jsonprojects;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.System.*;


public class Filehandling {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\kumar\\IdeaProjects\\Bootcoding-Java\\src\\miniproject\\jsonprojects\\data.json");
            Scanner scanner = new Scanner(file);
            StringBuilder jsonData = new StringBuilder();

            while (scanner.hasNextLine()) {
                jsonData.append(scanner.nextLine());
            }
            scanner.close();

            JSONArray jsonArray = new JSONArray(jsonData.toString());

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String name = jsonObject.getString("name");
                int age = jsonObject.getInt("age");
                String city = jsonObject.getString("city");

                // JSON वैल्यू प्रिंट करें
                out.println("Name: " + name);
                out.println("Age: " + age);
                out.println("City: " + city);
                out.println("---------------------");
            }

        } catch (FileNotFoundException e) {
            out.println("Error: JSON file not found!");
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }
}
