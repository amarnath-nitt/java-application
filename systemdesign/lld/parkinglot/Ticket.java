package systemdesign.lld.parkinglot;

import systemdesign.lld.parkinglot.vehicle.Vehicle;

import java.util.Date;
import java.util.UUID;

/**
 * @author amarnath-nitt 14/05/25
 */
public class Ticket {
    private final String TICKET_PREFIX="PLT";
    private final String ticketNumber;
    private final Vehicle vehicle;
    private final ParkingSpot parkingSpot;
    private final Date entryTime;
    private Date exitTime;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot, Date entryTime) {
        this.ticketNumber =  TICKET_PREFIX + UUID.randomUUID() + System.currentTimeMillis();
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime() {
        this.exitTime = new Date();
    }
}
