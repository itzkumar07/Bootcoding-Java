package abstractionsimpleproject;

import static java.lang.System.*;

class Motorcycle extends LandVehicle {
    public Motorcycle(String brand, String model) {
        super(brand, model);
    }

    @Override

    public void startEngine() {
        out.println("Motorcycle engine started.");
    }

    @Override
    public void stopEngine() {
        out.println("Motorcycle engine stopped.");
    }

    @Override
    public void drive() {
        out.println("Motorcycle is cruising on the highway.");
    }
}
