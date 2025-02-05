package daythirteen.miniproject.todolistapplication;

import java.util.ArrayList;
import static java.lang.System.*;

public class ToDoList {
    private final ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String description){
        tasks.add(new Task(description));
        out.println("Task added successfully!");
    }

    public void removeTask(int index){
        if(index>=0 && index< tasks.size()){
            tasks.remove(index);
            out.println("Task removed successfully");
        } else{
            out.println("Invalid task number!");
        }
    }

    public void displayTasks(){
        if(tasks.isEmpty()){
            out.println("No task available.");
        }else {
            out.println("\n To-Do List:");
            for (int i= 0; i<tasks.size();i++){
                out.println((i+1)+ ". " + tasks.get(i).description());
            }
        }
    }

    public boolean isEmpty() {
        return true;
    }
}
