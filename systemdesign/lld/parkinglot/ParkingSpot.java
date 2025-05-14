package systemdesign.lld.parkinglot;

import systemdesign.lld.parkinglot.codetype.SpotType;
import systemdesign.lld.parkinglot.vehicle.Vehicle;

/**
 * @author amarnath-nitt 14/05/25
 */
public class ParkingSpot {
    private Long spotNumber;
    private SpotType spotType;
    private Vehicle vehicle;
    private boolean isAvailable;

    public ParkingSpot(Long spotNumber, SpotType spotType, Vehicle vehicle, boolean isAvailable) {
        this.spotNumber = spotNumber;
        this.spotType = spotType;
        this.vehicle = vehicle;
        this.isAvailable = isAvailable;
    }

    public ParkingSpot() {
    }

    public Long getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(Long spotNumber) {
        this.spotNumber = spotNumber;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
