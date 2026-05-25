package sbz.model.input;

import sbz.model.enums.TrafficDensity;
import sbz.model.enums.VehicleType;

public class Traffic {
    private TrafficDensity density;
    private boolean congested;
    private VehicleType frontVehicleType;
    
    public Traffic() {
    }

    public Traffic(TrafficDensity density, boolean congested, VehicleType frontVehicleType) {
        this.density = density;
        this.congested = congested;
        this.frontVehicleType = frontVehicleType;
    }

    public TrafficDensity getDensity() {
        return density;
    }

    public void setDensity(TrafficDensity density) {
        this.density = density;
    }

    public boolean isCongested() {
        return congested;
    }

    public void setCongested(boolean congested) {
        this.congested = congested;
    }

    public VehicleType getFrontVehicleType() {
        return frontVehicleType;
    }

    public void setFrontVehicleType(VehicleType frontVehicleType) {
        this.frontVehicleType = frontVehicleType;
    }

    @Override
    public String toString() {
        return "Traffic [density=" + density + ", congested=" + congested + ", frontVehicleType=" + frontVehicleType
                + "]";
    }
}