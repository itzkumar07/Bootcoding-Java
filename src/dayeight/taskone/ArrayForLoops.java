package dayeight.taskone;

import java.util.ArrayList;
import static java.lang.System.*;

public class ArrayForLoops {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //10
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        out.println(list);

        for (int i =0; i<list.size(); i++){
            if (list.get(i)==2) {
                out.println(i +"True");
            }
            else {
                out.println(i+" False");
            }
        }

        out.println("\n Check 6");
        for (int j =0; j<list.size(); j++){
            if(list.get(j)==3){
                out.println(j +" True");
                break;
            }else {
                out.println(j+" False");
            }
        }
        out.println("\n Check 2");
        for(int k =0; k<list.size(); k++){
            if(list.get(k)==2){
                out.println(k +" True");
                break;
            }
        }
    }
}
