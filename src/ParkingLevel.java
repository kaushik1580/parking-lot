import java.util.ArrayList;
import java.util.List;

class ParkingLevel {
  int levelNumber;
  List<ParkingSpot> spots;

  public ParkingLevel(int levelNumber, int numSpots) {
    this.levelNumber = levelNumber;
    this.spots = new ArrayList<>();
    for (int i = 1; i <= numSpots; i++) {
      spots.add(new ParkingSpot(i));
    }
  }
}
