package daythree;

public class DefaultConstructor {
    int number;

    public DefaultConstructor(){
        number = 10;
    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        System.out.println(obj.number);
    }
}
