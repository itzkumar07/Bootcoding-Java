package todolistapplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private final String description;
    private final String timestamp;
    private boolean isCompleted; // To track task completion status
    private final String priority; // Priority of the task (High, Medium, Low)

    public Task(String description, String priority) {
        this.description = description;
        this.timestamp = getCurrentTime();
        this.isCompleted = false; // Task is not completed when created
        this.priority = priority;
    }

    private String getCurrentTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }

    public String getDescription() {
        return description;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markCompleted() {
        this.isCompleted = true;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return isCompleted ? "✅ Completed" : "❌ Pending";
    }
}
