package daytwo;
import static java.lang.System.*;
public class Loops {
    public static void main(String[] args) {
        int i = 20;
        int j= 0;

        for (int s = 1; s <= i; s++){
            if (i>j){  //main loop
                out.println(s*i);
            } else if (i<j) {
                out.println(s-i);
            } else {
                out.println("Not found");
            }

        }

    }
}
