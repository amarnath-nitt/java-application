package systemdesign.lld.parkinglot;

import systemdesign.lld.parkinglot.fee.FeeStrategy;
import systemdesign.lld.parkinglot.fee.FlatFeeStrategy;
import systemdesign.lld.parkinglot.vehicle.Vehicle;

import java.util.*;

/**
 * @author amarnath-nitt 14/05/25
 */
public class ParkingLot {
    private static ParkingLot parkingLot=null;
    private List<ParkingFloor> parkingFloors;
    private Map<String, Ticket> availableTickets;

    private FeeStrategy feeStrategy;

    private ParkingLot() {
        feeStrategy = new FlatFeeStrategy();
        availableTickets = new HashMap<>();
        parkingFloors = new ArrayList<>();
    }
    public static ParkingLot getParkingLot() {
        if(parkingLot==null) {
            synchronized (ParkingLot.class) {
                if(parkingLot==null) {
                    parkingLot = new ParkingLot();
                }
            }
        }
        return parkingLot;
    }

    public void addParkingFloor(ParkingFloor parkingFloor) {
        parkingFloors.add(parkingFloor);
    }

    public static void setParkingLot(ParkingLot parkingLot) {
        ParkingLot.parkingLot = parkingLot;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        for (ParkingFloor parkingFloor : parkingFloors) {
            for (ParkingSpot parkingSpot : parkingFloor.getParkingSpots()) {
                if (parkingSpot.isAvailable()) {
                    parkingSpot.setVehicle(vehicle);
                    parkingSpot.setAvailable(false);
                    Ticket ticket= new Ticket(vehicle, parkingSpot, new Date());
                    availableTickets.put(ticket.getTicketNumber(), ticket);
                    return ticket;
                }
            }
        }
        return null;
    }

    public void unParkVehicle(Ticket ticket) {
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        parkingSpot.setVehicle(null);
        parkingSpot.setAvailable(true);
        ticket.setExitTime();
    }

    public double unParkVehicle(String ticketNumber) {
        Ticket ticket = availableTickets.get(ticketNumber);
        if(ticket == null) {
            throw new IllegalArgumentException("Invalid ticket number");
        }
        else {
            unParkVehicle(ticket);
            availableTickets.remove(ticketNumber);
            return feeStrategy.calculateFee(ticket);
        }
    }

    public List<ParkingSpot> getAvailableSpots() {
        List<ParkingSpot> availableSpots = new ArrayList<>();
        for (ParkingFloor parkingFloor : parkingFloors) {
            for (ParkingSpot parkingSpot : parkingFloor.getParkingSpots()) {
                if (parkingSpot.isAvailable()) {
                    availableSpots.add(parkingSpot);
                }
            }
        }
        return availableSpots;
    }

    public boolean isSpotAvailable(ParkingSpot parkingSpot) {
        return parkingSpot.isAvailable();
    }

    public boolean isVehicleParked(Vehicle vehicle) {
        for (ParkingFloor parkingFloor : parkingFloors) {
            for (ParkingSpot parkingSpot : parkingFloor.getParkingSpots()) {
                if (parkingSpot.getVehicle() != null && parkingSpot.getVehicle().equals(vehicle)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Ticket getTicketByVehicle(Vehicle vehicle) {
        for (Map.Entry<String, Ticket> entry : availableTickets.entrySet()) {
            if (entry.getValue().getVehicle().equals(vehicle)) {
                return entry.getValue();
            }
        }
        return null;
    }
}
