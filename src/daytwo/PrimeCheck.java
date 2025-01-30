package daytwo;
import static java.lang.System.*;
public class PrimeCheck {
    public static void main(String[] args) {
        int number = 29;
        if (isPrime(number)){
            out.println("Number is prime");
        } else {
            out.println("Number is not prime");
        }
    }

    public static boolean isPrime(int number ){
        if(number <= 1) return false;
        for(int i = 2; i <= number/2; i++){
            if(number % i == 0) return false;
        }
        return true;
    }
}
