package daythree;

import static java.lang.System.*;

public class ConstructorExample1 {
    int number;
    String text;

    //Constructor
    public ConstructorExample1(int number, String text){
        this.number = number;
        this.text = text;
    }

    public static void main(String[] args) {
        ConstructorExample1 obj = new ConstructorExample1(33,"Kumar");
        out.println(obj.number+" "+obj.text);
    }
}
