package daythirteen.miniproject.stdmgsystem;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;   

public class StudentManagementSystemMain {
    private ArrayList<Student> students;

    public StudentManagementSystemMain() {
        students = new ArrayList<>();
    }

    public void addStudent(int id, String name, int age) {
        students.add(new Student(id, name, age));
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            out.println("No students available.");
        } else {
            for (Student student : students) {
                out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystemMain sms = new StudentManagementSystemMain();

        while (true) {
            out.println("1. Add Student");
            out.println("2. Display Students");
            out.println("3. Exit");
            out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // consume newline
                    out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    sms.addStudent(id, name, age);
                    break;

                case 2:
                    sms.displayStudents();
                    break;

                case 3:
                    out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    out.println("Invalid choice! Try again.");
            }
        }
    }
}
