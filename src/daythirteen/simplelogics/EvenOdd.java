package daythirteen.simplelogics;

import java.util.Scanner;
import static java.lang.System.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Enter a number");  
        int number = scanner.nextInt();
        
<<<<<<< HEAD
=======

>>>>>>> 255f6e85ab3ca1ac3af622af92d206b42db58dc0
        if (number % 2 == 0) {
            out.println("Even number");
        } else {
            out.println("Odd number");
        }
    }
}
