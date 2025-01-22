package dayone;

import static java.lang.System.*;

public class Person {
    String name ;
    int age;

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){
        out.println("Name:- "+name +", Age:- "+age);
    }
}
