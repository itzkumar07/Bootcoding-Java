package daysixth.basicjavaoperationsproject;

import java.util.Arrays;
import static java.lang.System.*;

public class BasicJavaOperations {
    public static void main(String[] args) {
        // Test array for ArrayOperations
        int[] sampleArray = {1, 2, 3, 4, 5};
        new ArrayOperations() {}.printArrayOperations(sampleArray);

        // Testing Operations and StringOperations
        new Operations().printOperations();
        new StringOperations().printStringOperations("Hello");

        // Test CalculateAverage using a helper method
        testCalculateAverage();
    }

    private static void testCalculateAverage() {
        CalculateAverage calculateAverage = new CalculateAverage() {
            @Override
            public double calculateAverage(double[] numbers) {
                return Arrays.stream(numbers).average().orElse(0);
            }

            @Override
            public double calculateAverage(int[] numbers) {
                return Arrays.stream(numbers).average().orElse(0);
            }

            @Override
            public double calculateAverage(String[] numbers) {
                return Arrays.stream(numbers)
                        .mapToDouble(Double::parseDouble)
                        .average().orElse(0);
            }

            @Override
            public double calculateAverage(long[] numbers) {
                return Arrays.stream(numbers).average().orElse(0);
            }

            @Override
            public double calculateAverage(float[] numbers) {
                float sum = 0;
                for (float num : numbers) {
                    sum += num;
                }
                return sum / numbers.length;
            }
        };

        // Arrays for testing
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        String[] stringArray = {"1.1", "2.2", "3.3", "4.4", "5.5"};
        long[] longArray = {10000000000L, 20000000000L, 30000000000L};
        float[] floatArray = {1.2f, 2.3f, 3.4f, 4.5f};

        // Print results
        out.println("Average of int array: " + calculateAverage.calculateAverage(intArray));
        out.println("Average of double array: " + calculateAverage.calculateAverage(doubleArray));
        out.println("Average of string array: " + calculateAverage.calculateAverage(stringArray));
        out.println("Average of long array: " + calculateAverage.calculateAverage(longArray));
        out.println("Average of float array: " + calculateAverage.calculateAverage(floatArray));
    }
}
