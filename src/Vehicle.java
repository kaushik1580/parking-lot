import Enums.VehicleType;

public abstract class Vehicle {
  String licensePlate;
  VehicleType type;

  public Vehicle(String licensePlate, VehicleType type) {
    this.licensePlate = licensePlate;
    this.type = type;
  }
}
