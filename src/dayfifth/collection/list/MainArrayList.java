package dayfifth.collection.list;
import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        for(String s : list){
            System.out.println(s);
        }
        System.out.println(list.size());
    }
}
