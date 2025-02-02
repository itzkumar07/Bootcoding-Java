package dayfour.arryas;

import static java.lang.System.*;

public class LargestSmallestElement {
    public static void main(String[] args) {
        // Array of integers
        int[] arr = {1, 2, 38, 4, 65, 62, 73, 84, 9, 10};

        // Initialize largest and smallest to extreme values
        int largest = Integer.MIN_VALUE; // Smallest possible integer value
        int smallest = Integer.MAX_VALUE; // Largest possible integer value

        // Loop through the array to find the largest and smallest elements
        for (int num : arr) {
            if (num > largest) {
                largest = num; // Update largest
            }
            if (num < smallest) {
                smallest = num; // Update smallest
            }
        }

        // Output the results
        out.println("Largest element is: " + largest);
        out.println("Smallest element is: " + smallest);
    }
}
