package daysix.abstractionproject;

import static java.lang.System.*;

public class AbstractExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.sleep();
        dog.eat();
        out.println("======================");

        Animal cat = new Cat();
        cat.sound();
        cat.sleep();
        cat.eat();

    }
}
