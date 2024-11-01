package Lab5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("VW Golf 5"));
        vehicles.add(new Truck("Toyota Tacoma"));
        vehicles.add(new Motorcycle("Ducati SuperSport 950"));

        for (Vehicle vehicle: vehicles){
            System.out.println(vehicle.service());
            vehicle.simulateYear();

            if (vehicle instanceof Car){
                Car car = (Car) vehicle;
                car.drive(100);
            } else if (vehicle instanceof Truck){
                Truck truck = (Truck) vehicle;
                truck.haul(50000);
            } else if (vehicle instanceof Motorcycle){
                Motorcycle motorcycle = (Motorcycle) vehicle;
                motorcycle.race(5550000);
            }
        }

        for (Vehicle vehicle: vehicles){
            Vehicle.performMaintenance(vehicle);
        }
    }
}
