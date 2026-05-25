package sbz.model.events;

import org.kie.api.definition.type.Role;
import org.kie.api.definition.type.Timestamp;

@Role(Role.Type.EVENT)
@Timestamp("timestamp")
public class HardBrakingEvent {

    private long timestamp;

    public HardBrakingEvent() {
    }

    public HardBrakingEvent(long timestamp) {
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
        return "HardBrakingEvent{" + "timestamp=" + timestamp + '}';
    }
}