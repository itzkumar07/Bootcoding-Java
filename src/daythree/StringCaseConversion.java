package daythree;
import static java.lang.System.*;
public class StringCaseConversion {
    public static void main(String[] args) {
        String str = "hello";

        // Convert the first character to uppercase and the rest to lowercase
        String result = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();

        out.println("Result: " + result);
    }
}
