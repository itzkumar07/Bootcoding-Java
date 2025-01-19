package dayfour.arryas;

public class ArrayCountEvenOdd {
    public static void main(String[] args) {
        int [] arr = {1,232,33,43,54,6,778,8,9,10};
        int EvenCount = 0, OddCount = 0;

        for(int i = 0; i<arr.length; i++){
            if (arr[i] % 2 ==0){
                EvenCount++;
            }else {
                OddCount++;
            }
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);
        System.out.println("Even Count: " + EvenCount);
        System.out.println("Odd Count: " + OddCount);

    }
}
