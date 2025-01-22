package daythree;

import static java.lang.System.*;

public class DefaultConstructor {
    int number;

    public DefaultConstructor(){
        number = 10;
    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        out.println(obj.number);
    }
}
