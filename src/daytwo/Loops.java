package daytwo;

public class Loops {
    public static void main(String[] args) {
        int i = 20;
        int j= 0;

        for (int s = 1; s <= i; s++){
            if (i>j){
                System.out.println(s*i);
            } else if (i<j) {
                System.out.println(s-i);
            } else {
                System.out.println("Not found");
            }

        }

    }
}
