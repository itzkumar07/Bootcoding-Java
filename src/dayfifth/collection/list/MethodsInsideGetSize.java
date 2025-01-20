package dayfifth.collection.list;

import java.util.ArrayList;
import static java.lang.System.*;

public class MethodsInsideGetSize {
    ArrayList<String> list = new ArrayList<>();

    public void add(String s){
        list.add(s);
    }

    public void print(){

        for(String s : list){
            out.println(s);
        }
    }

    public int size(){
        return list.size();
    }
}
