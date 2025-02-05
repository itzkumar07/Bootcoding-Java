package daythirteen.miniproject.abstractionsimpleproject;


abstract class AirVehicle extends Vehicle{
    AirVehicle(String brand, String model){
        super(brand, model);
    }

    public abstract void fly();
}
