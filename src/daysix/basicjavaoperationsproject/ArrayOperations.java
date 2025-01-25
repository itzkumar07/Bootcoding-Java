package daysix.basicjavaoperationsproject;

import java.util.Arrays;
import static java.lang.System.*;

public abstract class ArrayOperations {

    public void printArray(int[] arr) {
        out.println(Arrays.toString(arr));
        out.println("Length of the array is: " + arr.length);
        for (int num : arr) {
            out.println(num + " ");
        }
        out.println();
    }

    public void findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        out.println("Max value is: " + max);
    }

    public void findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        out.println("Min value is: " + min);
    }

    public void calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;
        out.println("Average value is: " + average);
    }

    public void printArrayOperations(int[] arr) {
        printArray(arr);
        findMax(arr);
        findMin(arr);  // Call to findMin
        calculateAverage(arr);  // Call to calculateAverage
    }
}
