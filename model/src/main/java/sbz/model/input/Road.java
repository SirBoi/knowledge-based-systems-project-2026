package sbz.model.input;

import sbz.model.enums.RoadConditionType;
import sbz.model.enums.RoadType;

public class Road {
    private RoadType type;
    private int laneCount;
    private int slope;
    private RoadConditionType condition;
    
    public Road() {
    }

    public Road(RoadType type, int laneCount, int slope, RoadConditionType condition) {
        this.type = type;
        this.laneCount = laneCount;
        this.slope = slope;
        this.condition = condition;
    }

    public RoadType getType() {
        return type;
    }

    public void setType(RoadType type) {
        this.type = type;
    }

    public int getLaneCount() {
        return laneCount;
    }

    public void setLaneCount(int laneCount) {
        this.laneCount = laneCount;
    }

    public int getSlope() {
        return slope;
    }

    public void setSlope(int slope) {
        this.slope = slope;
    }

    public RoadConditionType getCondition() {
        return condition;
    }

    public void setCondition(RoadConditionType condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Road [type=" + type + ", laneCount=" + laneCount + ", slope=" + slope + ", condition=" + condition
                + "]";
    }
}