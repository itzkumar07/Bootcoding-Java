package abstractionsimpleproject;

import static java.lang.System.*;

class Car extends LandVehicle {
    Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void startEngine() {
        out.println("Car engine started...");
    }

    @Override
    public void stopEngine() {
        out.println("Car engine stopped.");
    }

    @Override
    public void drive() {
        out.println("Car is driving on the road...");
    }
}
