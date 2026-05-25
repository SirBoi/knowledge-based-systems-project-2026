package sbz.model.input;

import sbz.model.enums.DrivingStyle;

public class Driver {
    private int continuousDrivingTime;
    private int totalDailyDrivingTime;
    private int totalDailyBreakTime;
    private int hardBrakingCount;
    private int hardAccelerationCount;
    private long lastRestTimestamp;
    private DrivingStyle drivingStyle;
    
    public Driver() {
    }

    public Driver(int continuousDrivingTime, int totalDailyDrivingTime, int totalDailyBreakTime,
            int hardBrakingCount, int hardAccelerationCount, long lastRestTimestamp, DrivingStyle drivingStyle) {
        this.continuousDrivingTime = continuousDrivingTime;
        this.totalDailyDrivingTime = totalDailyDrivingTime;
        this.totalDailyBreakTime = totalDailyBreakTime;
        this.hardBrakingCount = hardBrakingCount;
        this.hardAccelerationCount = hardAccelerationCount;
        this.lastRestTimestamp = lastRestTimestamp;
        this.drivingStyle = drivingStyle;
    }

    public int getContinuousDrivingTime() {
        return continuousDrivingTime;
    }

    public void setContinuousDrivingTime(int continuousDrivingTime) {
        this.continuousDrivingTime = continuousDrivingTime;
    }

    public int getTotalDailyDrivingTime() {
        return totalDailyDrivingTime;
    }

    public void setTotalDailyDrivingTime(int totalDailyDrivingTime) {
        this.totalDailyDrivingTime = totalDailyDrivingTime;
    }

    public int getTotalDailyBreakTime() {
        return totalDailyBreakTime;
    }

    public void setTotalDailyBreakTime(int totalDailyBreakTime) {
        this.totalDailyBreakTime = totalDailyBreakTime;
    }

    public int getHardBrakingCount() {
        return hardBrakingCount;
    }

    public void setHardBrakingCount(int hardBrakingCount) {
        this.hardBrakingCount = hardBrakingCount;
    }

    public int getHardAccelerationCount() {
        return hardAccelerationCount;
    }

    public void setHardAccelerationCount(int hardAccelerationCount) {
        this.hardAccelerationCount = hardAccelerationCount;
    }

    public long getLastRestTimestamp() {
        return lastRestTimestamp;
    }

    public void setLastRestTimestamp(long lastRestTimestamp) {
        this.lastRestTimestamp = lastRestTimestamp;
    }

    public DrivingStyle getDrivingStyle() {
        return drivingStyle;
    }

    public void setDrivingStyle(DrivingStyle drivingStyle) {
        this.drivingStyle = drivingStyle;
    }

    @Override
    public String toString() {
        return "Driver [continuousDrivingTime=" + continuousDrivingTime + ", totalDailyDrivingTime="
                + totalDailyDrivingTime + ", totalDailyBreakTime=" + totalDailyBreakTime + ", hardBrakingCount="
                + hardBrakingCount + ", hardAccelerationCount=" + hardAccelerationCount + ", lastRestTimestamp="
                + lastRestTimestamp + ", drivingStyle=" + drivingStyle + "]";
    }   
}