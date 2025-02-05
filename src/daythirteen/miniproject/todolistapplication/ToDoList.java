package daythirteen.miniproject.todolistapplication;

import java.util.ArrayList;
import static java.lang.System.*;

public class ToDoList {
    private final ArrayList<Task> tasks = new ArrayList<>();

    // Method to add a task with priority
    void addTask(String description, String priority) {
        tasks.add(new Task(description, priority));
        out.println("✅ Task added successfully with priority: " + priority);
    }

    void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            out.println("✅ Task removed successfully!");
        } else {
            out.println("❌ Invalid task number!");
        }
    }

    void displayTasks() {
        if (tasks.isEmpty()) {
            out.println("📌 No tasks available.");
        } else {
            out.println("\n📃 To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                out.println((i + 1) + ". " + task.getDescription() + " (🕒 " + task.getTimestamp() + ") "
                        + "[Priority: " + task.getPriority() + "] - " + task.getStatus());
            }
        }
    }

    void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markCompleted();
            out.println("✅ Task marked as completed!");
        } else {
            out.println("❌ Invalid task number!");
        }
    }

    boolean isEmpty() {
        return tasks.isEmpty();
    }
}
