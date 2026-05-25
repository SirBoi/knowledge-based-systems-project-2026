package sbz.model.events;

import org.kie.api.definition.type.Role;
import org.kie.api.definition.type.Timestamp;

@Role(Role.Type.EVENT)
@Timestamp("timestamp")
public class DriverRestEvent {

    private long timestamp;

    public DriverRestEvent() {
    }

    public DriverRestEvent(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "DriverRestEvent{" + "timestamp=" + timestamp + '}';
    }
}