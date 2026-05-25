package sbz.model;

public class RiskLevel {

    public enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    private Level level;

    public RiskLevel() {}

    public RiskLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}