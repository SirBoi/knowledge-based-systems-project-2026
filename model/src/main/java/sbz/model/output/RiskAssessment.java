package sbz.model.output;

import sbz.model.enums.RiskLevel;

public class RiskAssessment {
    private RiskLevel level;

    public RiskAssessment(RiskLevel level) {
        this.level = level;
    }

    public RiskAssessment() {
    }

    public RiskLevel getLevel() {
        return level;
    }

    public void setLevel(RiskLevel level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "RiskAssessment [level=" + level + "]";
    }
}