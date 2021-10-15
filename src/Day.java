import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalTime;

/**
 * Each day should comprise its date, day, and a map with half-hour intervals as keys and task names as values.
 * The empty string as a value represents no task being scheduled, i.e. free time.
 */

public class Day {
    public LocalDate dayOfMonth;
    public DayOfWeek dayOfWeek;
    public Map<Double, String> todaySchedule;


    public Day(LocalDate dayOfMonth){
        this.dayOfMonth = dayOfMonth;
        this.dayOfWeek = dayOfMonth.getDayOfWeek();
        this.todaySchedule = new HashMap<>();
        // Set all initial half-hour blocks to the empty string, which represents
        // no task scheduled (free time)/
        for(double i = 0.0; i < 24.0; i = i + 0.5){
            this.todaySchedule.put(i, "");
        }
    }


    // TODO: account for free time before first task and after last task.
}
