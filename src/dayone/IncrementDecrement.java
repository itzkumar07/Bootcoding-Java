package dayone;
import static java.lang.System.*;
class IncrementDecrement {
    public static void main(String[] args) {
        int num = 5;

        out.println("Original: " + num);
        out.println("Post-increment: " + (num++));
        out.println("After Post-increment: " + num);
        out.println("Pre-increment: " + (++num));

        out.println("Post-decrement: " + (num--));
        out.println("After Post-decrement: " + num);
        out.println("Pre-decrement: " + (--num));
    }
}
