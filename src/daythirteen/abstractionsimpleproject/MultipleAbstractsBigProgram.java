package daythirteen.abstractionsimpleproject;

import static java.lang.System.*;

public class MultipleAbstractsBigProgram {
    public static void main(String[] args) {
        Vehicle [] vehicles = new Vehicle[4];
        vehicles[0]= new Car("Toyota", "Corolla");
        vehicles[1] = new Motercycle("Harley-Davidson","Street 750");
        vehicles[2]= new Airplane("Boeing","727");
        vehicles[3]= new Helicopter("Bell","206");

        for (Vehicle vehicle: vehicles){
            vehicle.displayInfo();
            vehicle.startEngine();

            if (vehicle instanceof LandVehicle){
                ((LandVehicle) vehicle).drive();
            }else if (vehicle instanceof AirVehicle){
                ((AirVehicle) vehicle).fly();
            }
            vehicle.stopEngine();
            out.println("________________________________________");
        }
    }
}
