package sbz.model;

public class Recommendation {

    private String message;

    public Recommendation() {}

    public Recommendation(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}