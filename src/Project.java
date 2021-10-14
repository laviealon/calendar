import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// comment
public class Project {

    public double calculateMinHours(LocalDate startDate, LocalDate dueDate, double totalHours, double frequency) {
        long diff = ChronoUnit.DAYS.between(startDate, dueDate);
        double idealChunk = totalHours/(diff*(frequency/7));
        return Math.max(idealChunk, 0.5);
    }

}
