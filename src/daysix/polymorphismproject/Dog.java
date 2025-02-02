package daysix.polymorphismproject;

import static java.lang.System.*;

public class Dog extends Animal {
    @Override
    public void makeSound(){
        out.println( "Dog is making sound");
    }
}
