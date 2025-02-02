package daysix.interfacesimpleproject;

import static java.lang.System.*;

public class InterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();

        out.println();

        Pet cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.play();
    }
}
