package daysix.basicjavaoperationsproject;

import static java.lang.System.*;

public class StringOperations {

    public void reverseString(String str){
        out.println(" reverse of the string is: "+ new StringBuilder(str).reverse());
        out.println("Length of the string is: "+str.length());
        String reversed = new StringBuilder(str).reverse().toString();
        out.println("Reversed string is: "+reversed);
    }

    public void converseToUpperCase(String str){
        out.println("uppercase of the string is: "+str.toUpperCase());
    }

    public void printStringOperations(String str){
        reverseString(str);
        converseToUpperCase(str);
    }
}
