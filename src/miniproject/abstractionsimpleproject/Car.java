package miniproject.abstractionsimpleproject;

import static java.lang.System.*;

class Car extends LandVehicle{
    Car(String brand, String model){
        super(brand, model);
    }

    @Override
    public void startEngine() {
        out.println("string engine...");

    }

    @Override
    public void stopEngine() {
        out.println("stop engine");
    }

    @Override
    public void drive() {
        out.println("car is driving on the road..");
    }
}


