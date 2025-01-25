package daysix.additionalmethods;

import static java.lang.System.*;

public class ArraysStringAdditionalMethodsMain {
    public static void main(String[] args) {
        StringHandler stringHandler = new StringHandler();
        stringHandler.getLength("Kumar");
        stringHandler.reverse("Kumar");
        ArrayHandler arrayHandler = new ArrayHandler();
        out.println(arrayHandler.findMax(new int[] {1,2,3,4,5,5,6,6}));

        out.println();
        arrayHandler.printArrayHandler(new int[]{6,7,4,4,2,6,7});
    }
}