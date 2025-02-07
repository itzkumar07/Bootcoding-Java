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
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> searchStudent();
                case 6 -> {
                    out.println("Exiting...");
                    return;
                }
                default -> out.println("Invalid choice! Please try again.");
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
        scanner.nextLine();  // Consume the leftover newline
        String city = scanner.nextLine();

        students.add(new Students(id, name, age, city));
        out.println("Student added successfully!");
    }

    public static void viewStudents() {
        if (students.isEmpty()) {
            out.println("No students found.");
        } else {
            for (Students student : students) {
                out.println(student);
            }
        }
    }

    public static void updateStudent() {
        out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        Students studentToUpdate = null;

        for (Students s : students) {
            if (s.getId() == id) {
                studentToUpdate = s;
                break;
            }
        }

        if (studentToUpdate != null) {
            scanner.nextLine();  // Consume leftover newline

            out.print("Enter new Name: ");
            String name = scanner.nextLine();

            out.print("Enter new Age: ");
            int age = scanner.nextInt();

            out.print("Enter new City: ");
            scanner.nextLine();  // Consume leftover newline
            String city = scanner.nextLine();

            studentToUpdate.setName(name);
            studentToUpdate.setAge(age);
            studentToUpdate.setCity(city);

            out.println("Student details updated successfully!");
        } else {
            out.println("Student not found.");
        }
    }

    public static void deleteStudent() {
        out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();
        Students studentToRemove = null;

        for (Students s : students) {
            if (s.getId() == id) {
                studentToRemove = s;
                break;
            }
        }

        if (studentToRemove != null) {
            students.remove(studentToRemove);
            out.println("Student record deleted successfully!");
        } else {
            out.println("Student not found!");
        }
    }

    public static void searchStudent() {
        out.print("Enter Student ID to search: ");
        int id = scanner.nextInt();
        boolean found = false;

        for (Students s : students) {
            if (s.getId() == id) {
                out.println("Student found: " + s);
                found = true;
                break;
            }
        }

        if (!found) {
            out.println("Student not found!");
        }
    }
}
