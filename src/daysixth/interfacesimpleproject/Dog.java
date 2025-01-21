package daysixth.interfacesimpleproject;
import static java.lang.System.*;
public class Dog implements Animal{
    @Override
    public void eat() {
        out.println("Dog is eating");
    }
    @Override
    public void sleep() {
        out.println("Dog is sleeping");
    }
}
