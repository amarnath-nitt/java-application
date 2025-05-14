package systemdesign.lld.parkinglot;

import systemdesign.lld.parkinglot.codetype.SpotType;
import systemdesign.lld.parkinglot.codetype.VehicleType;
import systemdesign.lld.parkinglot.vehicle.Bike;
import systemdesign.lld.parkinglot.vehicle.Car;
import systemdesign.lld.parkinglot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amarnath-nitt 14/05/25
 */
public class ParkingLotDemo {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getParkingLot();

        List<ParkingSpot> parkingSpotsFloor1 = List.of(
                new ParkingSpot(101L, SpotType.COMPACT, null, true),
                new ParkingSpot(102L, SpotType.TRUCK, null, true),
                new ParkingSpot(103L, SpotType.TRUCK, null, true)
        );

        List<ParkingSpot> parkingSpotsFloor2 = List.of(
                new ParkingSpot(201L, SpotType.BIKE, null, true),
                new ParkingSpot(201L, SpotType.COMPACT, null, true)
        );

        // Add a floor with different types of spots
        ParkingFloor floor1 = new ParkingFloor(1L, parkingSpotsFloor1);
        ParkingFloor floor2 = new ParkingFloor(2L, parkingSpotsFloor2);

        parkingLot.addParkingFloor(floor1);
        parkingLot.addParkingFloor(floor2);

        // Create vehicles
        Vehicle car1 = new Car("ABC123");
        Vehicle car2 = new Car("XYZ789");
        Vehicle bike1 = new Bike("M1234");

        // View available spots
        System.out.println("Available spots for Car:");
        for (ParkingFloor floor: parkingLot.getParkingFloors()) {
            System.out.println("Floor: " + floor.getFloorNumber() + " " + floor.getAvailableSpots(VehicleType.CAR));
        }

        List<String> parkingTickets = new ArrayList<>();

        // Park vehicles
        try {
            Ticket ticket1 = parkingLot.parkVehicle(car1);
            System.out.println("Car 1 parked: " + ticket1.getTicketNumber());
            parkingTickets.add(ticket1.getTicketNumber());

            Ticket ticket2 = parkingLot.parkVehicle(car2);
            System.out.println("Car 2 parked: " + ticket2.getTicketNumber());
            parkingTickets.add(ticket2.getTicketNumber());

            Ticket ticket3 = parkingLot.parkVehicle(bike1);
            System.out.println("Bike 1 parked: " + ticket3.getTicketNumber());
            parkingTickets.add(ticket3.getTicketNumber());

            // Try parking another car when spots are full
            Vehicle car3 = new Car("DL0432");
            parkingLot.parkVehicle(car3);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Unpark vehicles
        try {
            double fee = parkingLot.unParkVehicle(parkingTickets.get(0)); // valid ticket ID
            System.out.println("Ticket: " + parkingTickets.get(0) + ", Fee: " + fee);

            fee = parkingLot.unParkVehicle("1"); // invalid ticket ID
        } catch (Exception e) {
            System.out.println("Exception while unparking: " + e.getMessage());
        }
    }
}
