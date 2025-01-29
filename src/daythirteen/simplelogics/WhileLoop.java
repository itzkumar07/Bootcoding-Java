package daythirteen.simplelogics;

import static java.lang.System.*;

public class WhileLoop {
    public static void main(String[] args) {
        int number = 0;
        while (number < 5) {
            out.println("Number is " + number);
            number++;
        }
    }
}
