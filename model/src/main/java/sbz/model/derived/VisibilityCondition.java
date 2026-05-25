package sbz.model.derived;

public class VisibilityCondition {
    private boolean lowVisibility;

    public VisibilityCondition() {
    }

    public VisibilityCondition(boolean lowVisibility) {
        this.lowVisibility = lowVisibility;
    }

    public boolean isLowVisibility() {
        return lowVisibility;
    }

    public void setLowVisibility(boolean lowVisibility) {
        this.lowVisibility = lowVisibility;
    }

    @Override
    public String toString() {
        return "VisibilityCondition [lowVisibility=" + lowVisibility + "]";
    }
}