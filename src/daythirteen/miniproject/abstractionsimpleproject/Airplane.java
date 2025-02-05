package daythirteen.miniproject.abstractionsimpleproject;

import static java.lang.System.*;

public class Airplane extends AirVehicle{
    public Airplane(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void startEngine() {
        out.println("Airplane engines started.");
    }

    @Override
    public void stopEngine() {
        out.println("Airplane engines shut down.");
    }

    @Override
    public void fly() {
        out.println("Airplane is flying in the sky.");
    }
}
