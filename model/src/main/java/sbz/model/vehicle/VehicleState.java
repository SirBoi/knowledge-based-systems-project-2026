package sbz.model.vehicle;

public class VehicleState {

    private int speed;
    private int speedLimit;

    public VehicleState() {}

    public VehicleState(int speed, int speedLimit) {
        this.speed = speed;
        this.speedLimit = speedLimit;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
}