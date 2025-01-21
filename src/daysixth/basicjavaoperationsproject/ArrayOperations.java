package daysixth.basicjavaoperationsproject;

import java.util.Arrays;
import static java.lang.System.*;

public abstract class ArrayOperations {
    public abstract int findMin(int[] array);

    public void printArray(int[] arr){
        out.println(Arrays.toString(arr));
        out.println("Length of the array is: "+arr.length);
        for (int num : arr){
            out.println(num+" ");
        }
        out.println();
    }
    public int findMax(int[] arr){
        int max = arr[0];
        for (int num : arr){
            if (num > max){
                max = num;
            }
        }
        out.println("Max value is: "+max);
        return max;
    }
    public void printArrayOperations (int[] arr){
        printArray(arr);
        findMax(arr);
    }

    public abstract double calculateAverage(int[] array);
}
