package abstractionsimpleproject;

abstract class LandVehicle extends Vehicle {
    LandVehicle(String brand, String model) {
        super(brand, model);
    }

    public abstract void drive();
}
