package daythirteen.simplelogics;

import java.util.Scanner;
import static java.lang.System.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Enter a number");  
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            out.println("Even number");
        } else {
            out.println("Odd number");
        }
    }
}
