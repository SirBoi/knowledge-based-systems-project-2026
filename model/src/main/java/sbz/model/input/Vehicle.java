package sbz.model.input;

import sbz.model.enums.BrakeCondition;
import sbz.model.enums.LoadLevel;

public class Vehicle {
    private double speed;
    private double speedLimit;
    private double mass;
    private LoadLevel loadLevel;
    private double acceleration;
    private double frontVehicleDistance;
    private BrakeCondition brakeCondition;
    private boolean lightsOn;
    
    public Vehicle() {
    }

    public Vehicle(double speed, double speedLimit, double mass, LoadLevel loadLevel, double acceleration,
            double frontVehicleDistance, BrakeCondition brakeCondition, boolean lightsOn) {
        this.speed = speed;
        this.speedLimit = speedLimit;
        this.mass = mass;
        this.loadLevel = loadLevel;
        this.acceleration = acceleration;
        this.frontVehicleDistance = frontVehicleDistance;
        this.brakeCondition = brakeCondition;
        this.lightsOn = lightsOn;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(double speedLimit) {
        this.speedLimit = speedLimit;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public LoadLevel getLoadLevel() {
        return loadLevel;
    }

    public void setLoadLevel(LoadLevel loadLevel) {
        this.loadLevel = loadLevel;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public double getFrontVehicleDistance() {
        return frontVehicleDistance;
    }

    public void setFrontVehicleDistance(double frontVehicleDistance) {
        this.frontVehicleDistance = frontVehicleDistance;
    }

    public BrakeCondition getBrakeCondition() {
        return brakeCondition;
    }

    public void setBrakeCondition(BrakeCondition brakeCondition) {
        this.brakeCondition = brakeCondition;
    }

    public boolean isLightsOn() {
        return lightsOn;
    }

    public void setLightsOn(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }

    @Override
    public String toString() {
        return "Vehicle [speed=" + speed + ", speedLimit=" + speedLimit + ", mass=" + mass + ", loadLevel=" + loadLevel
                + ", acceleration=" + acceleration + ", frontVehicleDistance=" + frontVehicleDistance
                + ", brakeCondition=" + brakeCondition + ", lightsOn=" + lightsOn + "]";
    }
}