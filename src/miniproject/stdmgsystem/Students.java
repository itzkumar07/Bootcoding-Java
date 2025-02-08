package miniproject.stdmgsystem;

public class Students {
    private final int id;
    private String name;
    private int age;
    private String city;

    public Students(int id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public int getId() {
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


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", City: " + city;
    }
}
