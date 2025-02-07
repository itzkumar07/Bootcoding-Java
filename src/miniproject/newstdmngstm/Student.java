package miniproject.newstdmngstm;

public class Student {
    private int id ;
    private String name;
    private int age;
    private String city;

    public Student(int id, String name, int age, String city){
        this.id=id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public int getId(){
        return id;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }
}
