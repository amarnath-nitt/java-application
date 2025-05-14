package systemdesign.lld.parkinglot.vehicle;

import systemdesign.lld.parkinglot.codetype.VehicleType;

/**
 * @author amarnath-nitt 14/05/25
 */
public class Truck extends Vehicle{
    public Truck(String modelNumber) {
        super(modelNumber, VehicleType.TRUCK);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "modelNumber='" + getModelNumber() + '\'' +
                ", vehicleType=" + getVehicleType() +
                '}';
    }
}
