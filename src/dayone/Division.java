package dayone;

import static java.lang.System.*;
public class Division {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 2;

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        out.println("Quotient: "+ quotient);
        out.println("Remainder: "+ remainder);
    }
}
