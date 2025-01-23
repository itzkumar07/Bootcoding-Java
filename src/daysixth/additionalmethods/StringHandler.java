package daysixth.additionalmethods;

import static java.lang.System.*;

public class StringHandler implements StringOperations{
    @Override
    public void getLength(String str){
        out.println(str);
    }

    @Override
    public String reverse (String str){
        StringBuilder reversed = new StringBuilder(str).reverse();
        out.println(reversed);
        return reversed.toString();
    }
}
