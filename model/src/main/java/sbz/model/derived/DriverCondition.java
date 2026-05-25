package sbz.model.derived;

public class DriverCondition {
    private boolean fatigued;
    private boolean aggressive;
    
    public DriverCondition() {
    }

    public DriverCondition(boolean fatigued, boolean aggressive) {
        this.fatigued = fatigued;
        this.aggressive = aggressive;
    }

    public boolean isFatigued() {
        return fatigued;
    }

    public void setFatigued(boolean fatigued) {
        this.fatigued = fatigued;
    }

    public boolean isAggressive() {
        return aggressive;
    }

    public void setAggressive(boolean aggressive) {
        this.aggressive = aggressive;
    }

    @Override
    public String toString() {
        return "DriverCondition [fatigued=" + fatigued + ", aggressive=" + aggressive + "]";
    }   
}