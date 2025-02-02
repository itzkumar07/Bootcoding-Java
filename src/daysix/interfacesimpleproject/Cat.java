package daysix.interfacesimpleproject;
import static java.lang.System.*;
public class Cat implements Pet{
    @Override
    public void play() {
        out.println("Cat is playing");
    }
    @Override
    public void eat() {
        out.println("Cat is eating");
    }
    @Override
    public void sleep() {
        out.println("Cat is sleeping");
    }
}
