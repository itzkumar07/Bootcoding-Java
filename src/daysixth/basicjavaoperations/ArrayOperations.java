package daysixth.basicjavaoperations;

import java.util.Arrays;
import static java.lang.System.*;

public class ArrayOperations {
    public void printArray(int[] arr){
        out.println(Arrays.toString(arr));
        out.println("Length of the array is: "+arr.length);
        for (int num : arr){
            out.println(num+" ");
        }
        out.println();
    }
    public void findMax(int[] arr){
        int max = arr[0];
        for (int num : arr){
            if (num > max){
                max = num;
            }
        }
        out.println("Max value is: "+max);
    }
    public void printArrayOperations (int[] arr){
        printArray(arr);
        findMax(arr);
    }
}
