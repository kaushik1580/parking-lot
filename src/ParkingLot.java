import Enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

class ParkingLot {
  List<ParkingLevel> levels;

  public ParkingLot(int numLevels, int spotsPerLevel) {
    this.levels = new ArrayList<>();
    for (int i = 1; i <= numLevels; i++) {
      levels.add(new ParkingLevel(i, spotsPerLevel));
    }
  }

  // Method to park a vehicle
  public boolean parkVehicle(Vehicle vehicle) {
    for (ParkingLevel level : levels) {
      for (ParkingSpot spot : level.spots) {
        if (!spot.occupied && canFitInSpot(vehicle, spot)) {
          spot.occupied = true;
          spot.vehicle = vehicle;
          System.out.println(vehicle.type + " parked at Level " + level.levelNumber + ", Spot " + spot.spotNumber);
          return true;
        }
      }
    }
    System.out.println("No available spot for " + vehicle.type);
    return false;
  }

  // Method to check if a vehicle can fit in a spot
  private boolean canFitInSpot(Vehicle vehicle, ParkingSpot spot) {
    switch (vehicle.type) {
      case MOTORCYCLE:
      case CAR:
      case BUS:
        return true;
      default:
        return false;
    }


// NOTE: Commneted code
//    if (vehicle.type == VehicleType.MOTORCYCLE) {
//      return true;
//    } else if (vehicle.type == VehicleType.CAR) {
//      return !spot.occupied || spot.vehicle.type == VehicleType.MOTORCYCLE;
//    } else {
//      return true;
//      int busRequiredSpots = 5; // Bus requires 5 consecutive spots
//      int endIndex = spot.spotNumber + busRequiredSpots - 1;
//
//      // Check if the endIndex is within the bounds of the row
//      if (endIndex < levels.get(0).spots.size()) {
//        // Check if all spots in the range are unoccupied
//        for (int i = spot.spotNumber; i <= endIndex; i++) {
//          if (levels.get(0).spots.get(i - 1).occupied) {
//            return false; // One of the spots is occupied
//          }
//        }
//        return true; // All spots are unoccupied in the consecutive range
//      }
//
//      return false; // Not enough spots in the row for the consecutive range
//    }
  }

  // Method to remove a vehicle from a spot
  public void removeVehicle(Vehicle vehicle) {
    for (ParkingLevel level : levels) {
      for (ParkingSpot spot : level.spots) {
        if (spot.occupied && spot.vehicle == vehicle) {
          spot.occupied = false;
          spot.vehicle = null;
          System.out.println(vehicle.type + " removed from Level " + level.levelNumber + ", spot " + spot.spotNumber);
          return;
        }
      }
    }
    System.out.println(vehicle.type + " not found");
  }

  // Method to get information about available spots
  public void getAvailableSpots() {
    for (ParkingLevel level : levels) {
      System.out.println("Level " + level.levelNumber + ":");
      for (ParkingSpot spot : level.spots) {
        if (!spot.occupied) {
          System.out.println("Spot " + spot.spotNumber + " is there");
        }
      }
    }
  }
}