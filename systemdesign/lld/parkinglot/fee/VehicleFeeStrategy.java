package systemdesign.lld.parkinglot.fee;

import systemdesign.lld.parkinglot.Ticket;
import systemdesign.lld.parkinglot.codetype.VehicleType;
import systemdesign.lld.parkinglot.vehicle.Vehicle;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author amarnath-nitt 14/05/25
 */
public class VehicleFeeStrategy implements FeeStrategy{
    private static Map<VehicleType, Double> vehicleTypeHourlyFee = new HashMap<>();
    static{
        vehicleTypeHourlyFee.put(VehicleType.CAR, 10.0);
        vehicleTypeHourlyFee.put(VehicleType.BIKE, 5.0);
        vehicleTypeHourlyFee.put(VehicleType.TRUCK, 15.0);
    }
    @Override
    public double calculateFee(Ticket ticket) {
        Vehicle vehicle = ticket.getVehicle();
        Date parkedTime = ticket.getEntryTime();
        Date exitTime = ticket.getExitTime();
        long parkedDuration = exitTime.getTime() - parkedTime.getTime();
        double hourlyFee = vehicleTypeHourlyFee.get(vehicle.getVehicleType());
        return (parkedDuration / 60.0) * hourlyFee;
    }
}
