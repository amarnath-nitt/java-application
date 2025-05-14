package systemdesign.lld.parkinglot;

import systemdesign.lld.parkinglot.codetype.SpotType;
import systemdesign.lld.parkinglot.codetype.VehicleType;

import java.util.List;

/**
 * @author amarnath-nitt 14/05/25
 */
public class ParkingFloor {
    private Long floorNumber;
    private List<ParkingSpot> parkingSpots;

    public ParkingFloor(Long floorNumber, List<ParkingSpot> parkingSpots) {
        this.floorNumber = floorNumber;
        this.parkingSpots = parkingSpots;
    }

    public ParkingFloor() {
    }

    public Long getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Long floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public String getAvailableSpots(VehicleType vehicleType) {
        StringBuilder availableSpots = new StringBuilder();
        for (ParkingSpot parkingSpot : parkingSpots) {
            if (parkingSpot.isAvailable()) {
                if(vehicleType.equals(VehicleType.CAR)){
                    if(parkingSpot.getSpotType().equals(SpotType.COMPACT) || parkingSpot.getSpotType().equals(SpotType.TRUCK)){
                        availableSpots.append(parkingSpot.getSpotNumber()).append(" ");
                    }
                }
                else if (vehicleType.equals(VehicleType.TRUCK)){
                    if(parkingSpot.getSpotType().equals(SpotType.TRUCK)){
                        availableSpots.append(parkingSpot.getSpotNumber()).append(" ");
                    }
                }
                else{
                    availableSpots.append(parkingSpot.getSpotNumber()).append(" ");
                }
            }
        }
        return availableSpots.toString();
    }
}
