import java.time.LocalDateTime;

public class NonFixedTask extends Task {
    public LocalDateTime dueDateTime;

    public NonFixedTask(String name, double duration, LocalDateTime dueDateTime){
        super(name, duration);
        this.dueDateTime = dueDateTime;
    }
}
