public class ParkingSpot {
  int spotNumber;
  boolean occupied;
  Vehicle vehicle;

  public ParkingSpot(int spotNumber) {
    this.spotNumber = spotNumber;
    this.occupied = false;
    this.vehicle = null;
  }
}
