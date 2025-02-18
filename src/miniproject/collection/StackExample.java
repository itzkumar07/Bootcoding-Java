package miniproject.collection;

import java.util.Scanner;
import java.util.Stack;
import static java.lang.System.*;

public class StackExample {
    public static void main(String[] args) {
        //1. Create a Stack 
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        
        //2. Push elements
        out.println("Enter 5 elements to push into the stack:");
        for (int i = 0; i < 5; i++) {
            out.println("Enter element " + (i + 1) + ":");
            
            int num = scanner.nextInt();

            stack.push(num);
               
        }
        //3. Display the stack
          out.println("Stack: " +stack); 

        // check if the stack is empty
        if (!stack.isEmpty()) {
            int topElement = stack.peek();
            out.println("Top element: " + topElement);          
        }

        //4. Pop elements  
        int popElements = stack.pop();
        out.println("Popped element: " + popElements);
    }
}