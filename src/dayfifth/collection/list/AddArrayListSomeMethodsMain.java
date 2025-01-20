package dayfifth.collection.list;

public class AddArrayListSomeMethodsMain extends AddArrayListSomeMethods {
    public static void main(String[] args) {
        AddArrayListSomeMethodsMain addArrayListSomeMethods = new AddArrayListSomeMethodsMain();
        addArrayListSomeMethods.add("Dushant");
        addArrayListSomeMethods.add("Kumar");
        addArrayListSomeMethods.add("Sharma");
        addArrayListSomeMethods.add("Raj");

        addArrayListSomeMethods.print();
        addArrayListSomeMethods.get(3);
        addArrayListSomeMethods.set(3, "Raju");
        addArrayListSomeMethods.remove(2);
        addArrayListSomeMethods.clear();
        addArrayListSomeMethods.isEmpty();
        addArrayListSomeMethods.size();
        addArrayListSomeMethods.contains("Raju");

        addArrayListSomeMethods.print();
    }
}
