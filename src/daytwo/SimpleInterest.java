package daytwo;
import static java.lang.System.*;
public class SimpleInterest {
    public static double calculateInterest(double principal, double rate, int time){
        return principal * rate * time / 100;
    }

    public static void main(String[] args) {
        double principale = 1000;
        double rate = 10;
        int time = 5;
        double interest = calculateInterest(principale, rate, time);
        out.println("The interest is: " + interest);
    }
}
