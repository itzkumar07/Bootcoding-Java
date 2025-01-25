package daysix.abstractionproject;

import static java.lang.System.*;

public class Dog extends Animal {
    @Override
    void sound() {
        out.println("Dog is making sound");
    }

    @Override
    void eat() {
        out.println("Dog is eating");
    }
}
