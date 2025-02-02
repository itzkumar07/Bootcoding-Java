package daythree;
import static java.lang.System.*;
public class ConstructorOverloading {
    int number ;
    String text;

<<<<<<< HEAD
    public ConstructorOverloading(){
=======
    ConstructorOverloading(){
>>>>>>> 255f6e8 (Initial commit)
        number = 110;
        text = "bootcoding";
    }

<<<<<<< HEAD
    public ConstructorOverloading(int number, String text){
=======
    ConstructorOverloading(int number, String text){
>>>>>>> 255f6e8 (Initial commit)
        this.number = number;
        this.text = text;
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1= new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading();

        out.println(obj1.number+" "+ obj1.text);
        out.println(obj2.number+" "+obj2.text);
<<<<<<< HEAD
=======
        out.println("--------------------------------------------------------------");  
>>>>>>> 255f6e8 (Initial commit)
    }
}
