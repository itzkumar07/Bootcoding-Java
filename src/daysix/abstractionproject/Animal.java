package daysix.abstractionproject;

import static java.lang.System.*;

abstract class Animal {
    abstract void sound();
    void sleep(){
        out.println("Animal is sleeping");
    }
}
