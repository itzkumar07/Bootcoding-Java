package daythree;
import static java.lang.System.*;
public class ConstructorOverloading {
    int number ;
    String text;

    public ConstructorOverloading(){
        number = 110;
        text = "bootcoding";
    }

    public ConstructorOverloading(int number, String text){
        this.number = number;
        this.text = text;
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1= new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading();

        out.println(obj1.number+" "+ obj1.text);
        out.println(obj2.number+" "+obj2.text);
    }
}
