package daythirteen.miniproject.abstractionsimpleproject;

import static java.lang.System.*;

public class Motercycle extends LandVehicle{
    public Motercycle(String brand, String model){
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
