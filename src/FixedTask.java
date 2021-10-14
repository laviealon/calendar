import java.time.LocalDateTime;
import java.time.LocalTime;

public class FixedTask extends Task {

    public FixedTask(String name, LocalDateTime startTime,  LocalTime duration){
        super(name, startTime, duration);
    }

}
