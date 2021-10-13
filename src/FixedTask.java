import java.time.LocalDateTime;

public class FixedTask extends Task {

    public FixedTask(String name, LocalDateTime startTime,  double duration){
        super(name, startTime, duration);
    }

}
