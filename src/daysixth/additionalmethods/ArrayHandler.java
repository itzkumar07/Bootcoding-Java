package daysixth.additionalmethods;

import static java.lang.System.*;

public class ArrayHandler implements ArrayOperations {

    @Override
    public int findMax(int[] array){
        int max = array[0];
        for(int num : array){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    @Override
    public int findMin(int[] array){
        int min = array[0];
        for(int num : array){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    @Override
    public void printArray(int[] array){
        for(int num : array){
            out.print(num + " ");
        }
        out.println();
    }

    @Override
    public double calculateAverage(int[] array){
        int sum = 0;
        for(int num : array){
            sum += num;
        }
        return (double)sum / array.length;
    }

    public void printArrayHandler(int[] array){
        findMax(array);
        findMin(array);
        printArray(array);
        calculateAverage(array);
    }
}
