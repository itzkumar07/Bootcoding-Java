package daysixth.basicjavaoperationsproject;

public class BasicJavaOperations {
    public static void main(String[] args) {
      ArrayOperations arrayOperations = new ArrayOperations() {
          @Override
          public int findMin(int[] array) {
              return 0;
          }

          @Override
          public double calculateAverage(int[] array) {
              return 0;
          }
      };
      arrayOperations.printArrayOperations(new int[]{1,2,3,4,5});

      Operations operations = new Operations();
      operations.printOperations();

      StringOperations stringOperations = new StringOperations();
      stringOperations.printStringOperations("Hello");
    }
}
