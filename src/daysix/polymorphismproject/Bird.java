package daysix.polymorphismproject;

import static java.lang.System.*;

public class Bird extends Animal{
    @Override
    public void makeSound(){
        out.println("Bird is making sound");
    }
}
