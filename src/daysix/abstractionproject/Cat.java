package daysix.abstractionproject;

import static java.lang.System.*;

public class Cat extends Animal {
    @Override
    void sound() {
        out.println("Cat is making sound");
    }

    @Override
    void eat() {
        out.println("Cat is eating");
    }
}
