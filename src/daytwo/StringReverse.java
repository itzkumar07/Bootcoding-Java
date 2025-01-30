package daytwo;
import static java.lang.System.*;
public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello, World!";
        out.println("Reversed string: "+ reverseString(str));
    }

    public static  String reverseString(String str){
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
