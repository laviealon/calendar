import java.time.LocalDateTime;
import java.time.LocalTime;

public class NonFixedTask extends Task {
    public LocalDateTime dueDateTime;

    public NonFixedTask(String name, LocalDateTime dueDateTime, LocalTime duration){
        super(name, duration);
        this.dueDateTime = dueDateTime;
    }
}
