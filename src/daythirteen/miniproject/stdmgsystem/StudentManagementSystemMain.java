package daythirteen.miniproject.stdmgsystem;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;


public class StudentManagementSystemMain {

    public static ArrayList<Students> students = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void addStudent() {

        out.println("Enter Your Id");
        int id = scanner.nextInt();

        out.println("Enter Your Name");
        String name = scanner.next();

        out.println("Enter Your Age");
        int age = scanner.nextInt();

        out.println("Enter Your City");
        String city = String.valueOf(scanner.nextInt());

        students.add(new Students(id, name, age, city));
    }

    public static void veiwStudent() {
        if (students.isEmpty()) {
            out.println("Studnets not found");
        } else {
            for (int i = 0; i < students.size(); i++) {
                out.println(students.get(i));
            }
        }
    }

    public static void updateStudent() {
        out.println("Enter ID");
        int id = scanner.nextInt();
        for (int i = 0; i < students.size(); i++) {
            Students s = students.get(i);
           
            if (s.getId() == id){
                scanner.nextLine();

                out.println("Enter your Name: ");
                String name = scanner.nextLine();

                out.println("Enter your age");
                int age = scanner.nextInt();

                out.println("Enter your City");
                String city= scanner.nextLine();
                
                s.setName(name);
                s.setAge(age);
                s.setCity(city);
            }
        }
    }
}
    
