package dayfour.arryas;
import static java.lang.System.*;
public class ArraysLoops {
    public static void main(String[] args) {
        int []  arr = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < arr.length; i++){
            out.println(arr[i]);
        }

        out.println("____________________________");

        for (int i : arr){
            out.println(arr[i]);
        }
    }
}
