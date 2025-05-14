package systemdesign.lld.parkinglot.vehicle;

import systemdesign.lld.parkinglot.codetype.VehicleType;

/**
 * @author amarnath-nitt 14/05/25
 */
public class Bike extends Vehicle{
    public Bike(String modelNumber) {
        super(modelNumber, VehicleType.BIKE);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "modelNumber='" + getModelNumber() + '\'' +
                ", vehicleType=" + getVehicleType() +
                '}';
    }
}
