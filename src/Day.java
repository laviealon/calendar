import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Each day should comprise its date, day, and a map with half-hour intervals as keys and task names as values.
 */

public class Day {
    public LocalDate dayOfMonth;
    public DayOfWeek dayOfWeek;
    public Map<Double, String> todaySchedule;

    public Day(LocalDate dayOfMonth){
        this.dayOfMonth = dayOfMonth;
        this.dayOfWeek = dayOfMonth.getDayOfWeek();
        this.todaySchedule = new HashMap<Double, String>();
    }

    // TODO: account for free time before first task and after last task.
}
