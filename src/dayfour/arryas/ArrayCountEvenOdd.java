package dayfour.arryas;

import static java.lang.System.*;
public class ArrayCountEvenOdd {
    public static void main(String[] args) {
        int [] arr = {1,232,33,43,54,6,778,8,9,10};
        int EvenCount = 0, OddCount = 0;

        for(int i = 0; i<arr.length; i++){
            if (arr[i] % 2 ==0){
                EvenCount++;
            }else {
                OddCount++;
            }
            out.println(arr[i]);
        }
        out.println(arr.length);
        out.println("Even Count: " + EvenCount);
        out.println("Odd Count: " + OddCount);

    }
}
