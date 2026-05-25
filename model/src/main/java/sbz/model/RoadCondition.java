package sbz.model;

public class RoadCondition {

    private String roadType; // CITY, HIGHWAY
    private boolean wet;

    public RoadCondition() {}

    public RoadCondition(String roadType, boolean wet) {
        this.roadType = roadType;
        this.wet = wet;
    }

    public String getRoadType() {
        return roadType;
    }

    public void setRoadType(String roadType) {
        this.roadType = roadType;
    }

    public boolean isWet() {
        return wet;
    }

    public void setWet(boolean wet) {
        this.wet = wet;
    }
}