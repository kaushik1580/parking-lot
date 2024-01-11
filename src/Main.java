import java.util.ArrayList;
import java.util.List;
import Enums.VehicleType;
//enum VehicleType {
//  MOTORCYCLE,
//  CAR,
//  BUS
//}

// Class representing a parking level

// Class representing a parking lot
public class Main {

  public static void main(String[] args) {

    System.out.println("Hello world!");

    // Create a parking lot with 2 levels, each having 10 spots
    ParkingLot parkingLot = new ParkingLot(2, 10);

    // Create vehicles
    Motorcycle motorcycle = new Motorcycle("ABC123", VehicleType.MOTORCYCLE);
    Car car = new Car("XYZ789", VehicleType.CAR);
    Bus bus = new Bus("BUS999", VehicleType.BUS);

    // Park vehicles
    parkingLot.parkVehicle(bus);
    parkingLot.parkVehicle(motorcycle);
    parkingLot.parkVehicle(car);

    // Display available spots
    parkingLot.getAvailableSpots();

    // Remove a vehicle
    parkingLot.removeVehicle(car);

    // Display available spots after removal
    parkingLot.getAvailableSpots();
  }
}