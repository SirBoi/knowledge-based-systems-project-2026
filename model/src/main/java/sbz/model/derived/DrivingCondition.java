package sbz.model.derived;

public class DrivingCondition {
    private boolean unsafeDistance;
    private boolean badRoadCondition;
    
    public DrivingCondition() {
    }

    public DrivingCondition(boolean unsafeDistance, boolean badRoadCondition) {
        this.unsafeDistance = unsafeDistance;
        this.badRoadCondition = badRoadCondition;
    }

    public boolean isUnsafeDistance() {
        return unsafeDistance;
    }

    public void setUnsafeDistance(boolean unsafeDistance) {
        this.unsafeDistance = unsafeDistance;
    }

    public boolean isBadRoadCondition() {
        return badRoadCondition;
    }

    public void setBadRoadCondition(boolean badRoadCondition) {
        this.badRoadCondition = badRoadCondition;
    }

    @Override
    public String toString() {
        return "DrivingCondition [unsafeDistance=" + unsafeDistance + ", badRoadCondition=" + badRoadCondition + "]";
    }
}