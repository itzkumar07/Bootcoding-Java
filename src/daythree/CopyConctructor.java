package daythree;

public class CopyConctructor {
    int number;
    String text;

    public CopyConctructor(int number, String text){
        this.number = number;
        this.text = text;
    }
    public CopyConctructor(CopyConctructor obj){
        this.number = obj.number;
        this.text = obj.text;

    }

    public static void main(String[] args) {
        CopyConctructor original= new CopyConctructor(11,"Adeeb");
        CopyConctructor copy = new CopyConctructor(original);
        System.out.println(original.number+" "+original.text);
        System.out.println(copy.number+" "+copy.text);
    }
}
