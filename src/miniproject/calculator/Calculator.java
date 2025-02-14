package calculator;

public class Calculator {
    public double calculate(double num1, double num2, char operator) {
        Operation operation = getOperation(operator); // Using private method to get the operation

        if (operation != null) {
            return operation.execute(num1, num2);
        } else {
            throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    private Operation getOperation(char operator) {
        return switch (operator) {
            case '+' -> new Addition();
            case '-' -> new Subtraction();
            case '*' -> new Multiplication();
            case '/' -> new Division();
            default -> null;
        };
    }

    // Private method to validate input (for example, positive numbers)
    boolean validateInput(double num1, double num2) {
        if (num1 < 0 || num2 < 0) {
            System.out.println("Both numbers must be non-negative.");
            return false;
        }
        return true;
    }
}

