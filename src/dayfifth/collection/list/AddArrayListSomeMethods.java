package dayfifth.collection.list;

import java.util.ArrayList;

import static java.lang.System.*;

public class AddArrayListSomeMethods {
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

    public String get(int index){
        return list.get(index);
    }

    public void set(int index, String s){
        list.set(index, s);
    }

    public void remove(int index){
        list.remove(index);
    }

    public void clear(){
        list.clear();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public boolean contains(String s){
        return list.contains(s);
    }
}
