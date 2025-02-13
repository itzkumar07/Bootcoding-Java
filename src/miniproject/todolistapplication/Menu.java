package todolistapplication;

import java.util.Scanner;
import static java.lang.System.*;

public class Menu {
    private final ToDoList toDoList = new ToDoList();
    private final Scanner scanner = new Scanner(System.in);

    void showMenu() {
        boolean running = true;

        while (running) {
            out.println("\n===== 📝 To-Do List Menu =====");
            out.println("1️⃣ Add Task");
            out.println("2️⃣ Remove Task");
            out.println("3️⃣ Display Tasks");
            out.println("4️⃣ Mark Task as Completed");
            out.println("5️⃣ Exit");
            out.print("Choose an option: ");

            if (!scanner.hasNextInt()) {
                out.println("❌ Invalid input! Please enter a number.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addTask();
                case 2 -> removeTask();
                case 3 -> toDoList.displayTasks();
                case 4 -> markTaskAsCompleted();
                case 5 -> {
                    out.println("🚀 Exiting... Goodbye!");
                    running = false;
                }
                default -> out.println("❌ Invalid option! Try again.");
            }
        }
        scanner.close();
    }

    private void addTask() {
        out.print("📝 Enter task description: ");
        String description = scanner.nextLine();

        out.print("Choose priority (High, Medium, Low): ");
        String priority = scanner.nextLine();

        toDoList.addTask(description, priority);
    }

    private void removeTask() {
        if (toDoList.isEmpty()) {
            out.println("📌 No tasks available to remove.");
            return;
        }

        out.print("❌ Enter task number to remove: ");
        if (scanner.hasNextInt()) {
            int index = scanner.nextInt();
            toDoList.removeTask(index - 1);
        } else {
            out.println("❌ Invalid input! Please enter a valid task number.");
            scanner.next();
        }
    }

    private void markTaskAsCompleted() {
        if (toDoList.isEmpty()) {
            out.println("📌 No tasks available to mark as completed.");
            return;
        }

        out.print("✔️ Enter task number to mark as completed: ");
        if (scanner.hasNextInt()) {
            int index = scanner.nextInt();
            toDoList.markTaskAsCompleted(index - 1);
        } else {
            out.println("❌ Invalid input! Please enter a valid task number.");
            scanner.next();
        }
    }
}
