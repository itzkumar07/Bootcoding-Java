package Day1;

public class variable_example1 {
    public static void main(String[] args) {
        int num =10;
        String text = "hello,Kuumar";
        double decimal = 3.14;
        var inferred = "inferred";

        System.out.println("--"+num);
        System.out.println("--"+text);
        System.out.println("--"+decimal);
        System.out.println("--"+inferred);

        System.out.println();

        System.out.println(num+" "+text);  //Concationation
        System.out.println(text+" "+decimal);//Concationation
        System.out.println(decimal+" "+inferred);//Concationation
        System.out.println(inferred+" "+num);
    }
}
