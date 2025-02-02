package daythree;
import static java.lang.System.*;
public class Loop2 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            out.println();
        }
    }
}
