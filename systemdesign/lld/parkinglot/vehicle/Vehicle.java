package systemdesign.lld.parkinglot.vehicle;

import systemdesign.lld.parkinglot.codetype.VehicleType;

/**
 * @author amarnath-nitt 14/05/25
 */
public abstract class Vehicle {
    private String modelNumber;
    private VehicleType vehicleType;

    public Vehicle(String modelNumber, VehicleType vehicleType) {
        this.modelNumber = modelNumber;
        this.vehicleType = vehicleType;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
