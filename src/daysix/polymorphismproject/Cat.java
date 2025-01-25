package daysix.polymorphismproject;

import static java.lang.System.*;

public class Cat extends Animal {
    @Override
    public void makeSound(){
        out.println("Cat is making sound");
    }
}
