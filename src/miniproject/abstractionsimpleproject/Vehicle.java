package abstractionsimpleproject;

import static java.lang.System.*;

abstract class Vehicle {
    protected String brand;
    protected String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void displayInfo() {
        out.println("Brand: " + brand + ", Model: " + model);
    }
}
