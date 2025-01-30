package dayone;
import static java.lang.System.*;
public class variable_example2 {
    public static void main(String[] args) {
        int num =10;
        String text = "hello,Kuumar";
        double decimal = 3.14;
        var inferred = "inferred";

        out.println(num+" "+text);  //Concationation
        out.println(text+" "+decimal);//Concationation
        out.println(decimal+" "+inferred);//Concationation
        out.println(inferred+" "+num);//Concationation

    }
}
