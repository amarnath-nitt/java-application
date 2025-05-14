package systemdesign.lld.parkinglot.vehicle;

import systemdesign.lld.parkinglot.codetype.VehicleType;

/**
 * @author amarnath-nitt 14/05/25
 */
public class Car extends Vehicle{
    public Car(String modelNumber) {
        super(modelNumber, VehicleType.CAR);
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelNumber='" + getModelNumber() + '\'' +
                ", vehicleType=" + getVehicleType() +
                '}';
    }
}
