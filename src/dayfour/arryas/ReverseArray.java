package dayfour.arryas;

import static java.lang.System.*;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        int [] revArr = new int[arr.length];

        for (int i = 0; i< arr.length; i++){
            revArr[i] = arr[arr.length-1-i];
        }

        for (int i = 0; i < revArr.length; i++){
            out.println(revArr[i]);
        }

        for (int i = 0; i < arr.length; i++){
            out.println(arr[i]);
        }
    }
}
