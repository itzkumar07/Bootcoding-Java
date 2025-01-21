package daysixth.basicjavaoperations;

import static java.lang.System.*;

public class Operations {
    public void performRelationalOperations(int a, int b){
        out.println("Realtional operations are: "  );
        out.println("a > b: "+(a>b));
        out.println("a < b: "+(a<b));
        out.println("a >= b: "+(a>=b));
    }
    public void performLogicalOperations(boolean a, boolean b)
    {
        out.println("Logical operations are: ");
        out.println("a && b: "+(a&&b));
        out.println("a || b: "+(a||b));
        out.println("!a: "+(!a));
    }
    public void printOperations(){
        performLogicalOperations(true,true);
        performRelationalOperations(10,20);
    }
}
