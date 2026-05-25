package sbz.model.input;

import sbz.model.enums.VisibilityLevel;

public class Weather {
    private boolean raining;
    private boolean snowing;
    private boolean foggy;
    private boolean isDay;
    private VisibilityLevel visibility;
    
    public Weather() {
    }

    public Weather(boolean raining, boolean snowing, boolean foggy, boolean isDay, VisibilityLevel visibility) {
        this.raining = raining;
        this.snowing = snowing;
        this.foggy = foggy;
        this.isDay = isDay;
        this.visibility = visibility;
    }

    public boolean isRaining() {
        return raining;
    }

    public void setRaining(boolean raining) {
        this.raining = raining;
    }

    public boolean isSnowing() {
        return snowing;
    }

    public void setSnowing(boolean snowing) {
        this.snowing = snowing;
    }

    public boolean isFoggy() {
        return foggy;
    }

    public void setFoggy(boolean foggy) {
        this.foggy = foggy;
    }

    public boolean isDay() {
        return isDay;
    }

    public void setDay(boolean isDay) {
        this.isDay = isDay;
    }

    public VisibilityLevel getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityLevel visibility) {
        this.visibility = visibility;
    }

    @Override
    public String toString() {
        return "Weather [raining=" + raining + ", snowing=" + snowing + ", foggy=" + foggy + ", isDay=" + isDay
                + ", visibility=" + visibility + "]";
    }
}