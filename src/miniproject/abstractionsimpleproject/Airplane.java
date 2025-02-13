package abstractionsimpleproject;

import static java.lang.System.*;

class Airplane extends AirVehicle {
    public Airplane(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void startEngine() {
        out.println("Airplane engine started.");
    }

    @Override
    public void stopEngine() {
        out.println("Airplane engine stopped.");
    }

    @Override
    public void fly() {
        out.println("Airplane is flying in the sky.");
    }
}
