package daythree;

public class ParameterizedConstructor {
    int number;
    String text;

    public ParameterizedConstructor(int number, String text){
        this.number= number;
        this.text= text;
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(2,"Kumar");
        System.out.println(obj.number+" "+obj.text);
    }
}
