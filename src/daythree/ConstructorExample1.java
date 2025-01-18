package daythree;

public class ConstructorExample1 {
    int number;
    String text;

    //Counstructor
    public ConstructorExample1(int number, String text){
        this.number = number;
        this.text = text;
    }
    public static void main(String[] args) {
        ConstructorExample1 obj = new ConstructorExample1(33,"Kumar");
        System.out.println(obj.number+" "+obj.text);

    }
}
