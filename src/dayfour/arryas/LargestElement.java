package dayfour.arryas;

public class LargestElement {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5,6,7,8,9,10 };
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] > largest){
                largest= arr[i];
            }
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("The Largest Number in Array "+largest);
        System.out.println("The Smallest Number in Array "+smallest);
    }
}
