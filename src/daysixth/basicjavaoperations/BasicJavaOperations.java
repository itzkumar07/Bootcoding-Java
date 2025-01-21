package daysixth.basicjavaoperations;

public class BasicJavaOperations {
    public static void main(String[] args) {
      ArrayOperations arrayOperations = new ArrayOperations();
      arrayOperations.printArrayOperations(new int[]{1,2,3,4,5});

      Operations operations = new Operations();
      operations.printOperations();

      StringOperations stringOperations = new StringOperations();
      stringOperations.printStringOperations("Hello");
    }
}
