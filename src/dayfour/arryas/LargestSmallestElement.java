package dayfour.arryas;

public class LargestSmallestElement {
    public static void main(String[] args) {
        //largest & Smallest element find
        int[] arr = {1, 2, 38, 4, 65, 62, 73, 84, 9, 10};
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++){ // Conndition creation in the largest and smallest arrays

            if (arr[i] > largest){ // Largest array find it
                largest = arr[i];
            }
            if (arr[i] < smallest){ // Smallest array find it
                smallest = arr[i];
            }
        }
        System.out.println("Largest element is: " + largest);
        System.out.println("Smallest element is: "+ smallest);

    }
}
