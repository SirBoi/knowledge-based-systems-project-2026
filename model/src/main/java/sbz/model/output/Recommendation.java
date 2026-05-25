package sbz.model.output;

public class Recommendation {
    private String message;

    public Recommendation(String message) {
        this.message = message;
    }

    public Recommendation() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Recommendation [message=" + message + "]";
    }
}