package abstractionsimpleproject;

import static java.lang.System.*;


// Main class to run the program
public class MultipleAbstractsBigProgram {
    public static void main(String[] args) {
        // Create an array of vehicles (land and air vehicles)
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("Toyota", "Corolla");
        vehicles[1] = new Motorcycle("Harley-Davidson", "Street 750");
        vehicles[2] = new Airplane("dd", "dd");
        vehicles[3] = new Helicopter("Bell", "206");

        // Iterate through each vehicle and call their methods
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.startEngine();

            if (vehicle instanceof LandVehicle landVehicle) {
                landVehicle.drive();
            } else if (vehicle instanceof AirVehicle airVehicle) {
                airVehicle.fly();
            }

            vehicle.stopEngine();
            out.println("________________________________________");
        }
    }
}
