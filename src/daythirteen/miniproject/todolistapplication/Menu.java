package daythirteen.miniproject.todolistapplication;

import java.util.Scanner;
import static java.lang.System.*;

public class Menu {
    private final ToDoList toDoList = new ToDoList();
    private final Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        boolean running = true; // Flag to control loop

        while (running) {
            out.println("\n===== To-Do List Menu =====");
            out.println("1. Add Task");
            out.println("2. Remove Task");
            out.println("3. Display Tasks");
            out.println("4. Exit");
            out.print("Choose an option: ");

            // Validate input
            if (!scanner.hasNextInt()) {
                out.println("❌ Invalid input! Please enter a number.");
                scanner.next(); // Consume invalid input
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addTask();
                case 2 -> removeTask();
                case 3 -> toDoList.displayTasks();
                case 4 -> {
                    out.println("🚀 Exiting... Goodbye!");
                    running = false; // Exit loop
                }
                default -> out.println("❌ Invalid option! Try again.");
            }
        }
        scanner.close(); // Close scanner outside the loop
    }

    private void addTask() {
        out.print("Enter task description: ");
        String description = scanner.nextLine();
        toDoList.addTask(description);
    }

    private void removeTask() {
        if (toDoList.isEmpty()) {
            out.println("📌 No tasks available to remove.");
            return;
        }

        out.print("Enter task number to remove: ");
        if (scanner.hasNextInt()) {
            int index = scanner.nextInt();
            toDoList.removeTask(index - 1);
        } else {
            out.println("❌ Invalid input! Please enter a valid task number.");
            scanner.next(); // Consume invalid input
        }
    }
}
