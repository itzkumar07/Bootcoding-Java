package Day3;

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

        System.out.println(obj1.number+" "+ obj1.text);
        System.out.println(obj2.number+" "+obj2.text);
    }
}
