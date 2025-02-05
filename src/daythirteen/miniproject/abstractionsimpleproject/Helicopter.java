package daythirteen.miniproject.abstractionsimpleproject;

import static java.lang.System.*;

public class Helicopter extends AirVehicle{
    public Helicopter(String brand, String model){
        super(brand, model);
    }

    @Override
    public void startEngine(){
        out.println("Helicopter rotor started.");
    }

    @Override
    public void stopEngine(){
        out.println("Helicopter rotor stopped");
    }

    @Override
    public void fly() {
        out.println("Helicopter is hovering is sky.");
    }
}
