package miniproject.calculator;

public class OOPCalculatorExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double num1 = 10;
        double num2 = 112;  // Set this to 0 for testing division by zero
        char operator = '/';  // Change operator for testing other operations

        try {
            // First, validate input (use the private method in Calculator class)
            if (calc.validateInput(num1, num2)) {
                double result = calc.calculate(num1, num2, operator);
                System.out.println("Result: " + result);
            }
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }  catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
