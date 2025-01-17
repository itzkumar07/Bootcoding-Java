package Day2;

public class FactorialExample {
    public static void main(String[] args) {
        FactorialExample obj = new FactorialExample();
        int number = 5;
        System.out.println(" Factorial of "+ number +obj.factorial(number));
    }
    public int factorial(int n){
        if (n == 1 ) return 1;
        return n * factorial(n-1);
    }
}
