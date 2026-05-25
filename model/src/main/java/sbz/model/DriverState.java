package sbz.model;

public class DriverState {

    private int continuousDrivingTime; // minutes

    public DriverState() {}

    public DriverState(int continuousDrivingTime) {
        this.continuousDrivingTime = continuousDrivingTime;
    }

    public int getContinuousDrivingTime() {
        return continuousDrivingTime;
    }

    public void setContinuousDrivingTime(int continuousDrivingTime) {
        this.continuousDrivingTime = continuousDrivingTime;
    }
}