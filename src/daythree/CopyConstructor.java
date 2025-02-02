package daythree;

import static java.lang.System.*;

public class CopyConstructor {
    int number;
    String text;

    public CopyConstructor(int number, String text){
        this.number = number;
        this.text = text;
    }

    public CopyConstructor(CopyConstructor obj){
        this.number = obj.number;
        this.text = obj.text;

    }

    public static void main(String[] args) {
        CopyConstructor original= new CopyConstructor(11,"Adeeb");
        CopyConstructor copy = new CopyConstructor(original);
        out.println(original.number+" "+original.text);
        out.println(copy.number+" "+copy.text);
    }
}
