package miniproject.stdmgsystem;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class StudentManagementSystemMain {
    private static final ArrayList<Students> students = new ArrayList<>();
    private static final Scanner scanner = new Scanner(in);

    public static void main(String[] args) {
        while (true) {
            out.println("\n1. Add Student");
            out.println("2. View Students");
            out.println("3. Update Student");
            out.println("4. Delete Student");
            out.println("5. Search Student");
            out.println("6. Exit");
            out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: searchStudent(); break;
                case 6: out.println("Exiting..."); return;
                default: out.println("Invalid choice! Please try again.");
            }
        }
    }

    public static void addStudent() {
        out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        out.print("Enter Student Name: ");
        String name = scanner.next();

        out.print("Enter Student Age: ");
        int age = scanner.nextInt();

        out.print("Enter Student City: ");
        scanner.nextLine();
        String city = scanner.nextLine();

        students.add(new Students(id, name, age, city));
        out.println("Student added successfully!");
    }

    public static void viewStudents() {
        if (students.isEmpty()) {
            out.println("No students found.");
        } else {
            for (int i = 0; i < students.size(); i++) {
                out.println(students.get(i));
            }
        }
    }

    public static void updateStudent() {
        out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                scanner.nextLine();
                out.print("Enter new Name: ");
                String name = scanner.nextLine();

                out.print("Enter new Age: ");
                int age = scanner.nextInt();

                out.print("Enter new City: ");
                scanner.nextLine();
                String city = scanner.nextLine();

                students.get(i).setName(name);
                students.get(i).setAge(age);
                students.get(i).setCity(city);

                out.println("Student details updated successfully!");
                return;
            }
        }
        out.println("Student not found.");
    }

    public static void deleteStudent() {
        out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                out.println("Student record deleted successfully!");
                return;
            }
        }
        out.println("Student not found!");
    }

    public static void searchStudent() {
        out.print("Enter Student ID to search: ");
        int id = scanner.nextInt();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                out.println("Student found: " + students.get(i));
                return;
            }
        }
        out.println("Student not found!");
    }
}
