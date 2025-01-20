package dayfifth.collection.list;
import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello"); //size 1
        list.add("World"); //size 2

        for(String s : list){
            System.out.println(s);
        }
        System.out.println(list.size()); // all Size printing
    }
}
