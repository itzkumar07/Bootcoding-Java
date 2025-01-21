package daysixth.interfacesimpleproject;

public class InterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();

        Pet cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.play();
    }
}
