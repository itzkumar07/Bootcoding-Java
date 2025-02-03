package daythree;
import static java.lang.System.*;
public class ConstructorOverloading {
    int number ;
    String text;

    ConstructorOverloading(){
        number = 110;
        text = "bootcoding";
    }

<<<<<<< HEAD
=======
    ConstructorOverloading(int number, String text){
        this.number = number;
        this.text = text;
    }

>>>>>>> 255f6e85ab3ca1ac3af622af92d206b42db58dc0
    public static void main(String[] args) {
        ConstructorOverloading obj1= new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading();

        out.println(obj1.number+" "+ obj1.text);
        out.println(obj2.number+" "+obj2.text);
        out.println("--------------------------------------------------------------");  
<<<<<<< HEAD

=======
>>>>>>> 255f6e85ab3ca1ac3af622af92d206b42db58dc0
    }
}
