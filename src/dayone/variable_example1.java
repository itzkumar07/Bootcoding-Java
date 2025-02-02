package dayone;
import static java.lang.System.*;
public class variable_example1 {
    public static void main(String[] args) {
        int num =10;
        String text = "hello,Kuumar";
        double decimal = 3.14;
        var inferred = "inferred";

        out.println("--"+num);
        out.println("--"+text);
        out.println("--"+decimal);
        out.println("--"+inferred);

        out.println();

        out.println(num+" "+text);  //Concationation
        out.println(text+" "+decimal);//Concationation
        out.println(decimal+" "+inferred);//Concationation
        out.println(inferred+" "+num);
    }
}
