package dayfour.arryas;
import static java.lang.System.*;
public class ArrayTraversal {
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        extracted(arr);
        extracted1(arr);
}

    private static void extracted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            out.println(arr[i]);

        }
    }

    private static void extracted1(int[] arr) {
        for (int i : arr) {
            out.println(i);
        }
    }
}