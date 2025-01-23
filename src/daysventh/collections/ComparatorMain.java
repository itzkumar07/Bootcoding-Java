package daysventh.collections;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.System.*;


class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return 0;
    }
}

public class ComparatorMain {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Kumar");
        list.add("Himanshu");
        list.add("Raj");

        List<String> sortedList = list.stream().sorted(new StringLengthComparator()).collect(Collectors.toList());
        out.println(sortedList);
    }
}
