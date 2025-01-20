package dayfifth.collection.list;

import java.util.ArrayList;

import static java.lang.System.*;

public class AddArraysListFormation {
    ArrayList<String> list = new ArrayList<>();
    public void add(String s){
        list.add(s);
    }
    public void print(){
        for(String s : list){
            out.println(s);
        }
    }

}
