package daythirteen.miniproject.abstractionsimpleproject;

abstract class LandVehicle extends Vehicle {
    public LandVehicle(String brand, String model) {
        super(brand, model);
    }

    // Abstract method specific to land vehicles
    public abstract void drive();
}