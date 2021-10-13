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

    public Day(LocalDate dayOfMonth, DayOfWeek dayOfWeek){
        this.dayOfMonth = dayOfMonth;
        this.dayOfWeek = dayOfWeek;
        this.todaySchedule = new HashMap<Double, String>();
    }

    /**
     * Puts an hour of a task into this.todaySchedule (see README for why the word "put" is used).
     * The reason we schedule one hour of a task at a time is twofold: (1) this.todaySchedule comprises
     * distinct half-hour intervals, and (2) if a task crosses over multiple days,
     * different half-hours will need to be scheduled onto different days.
     *
     * @param taskName: the name of the task which the hour that is to be scheduled is in.
     * @param startHour: the half-hour that marks the beginning of this hour of a task.
     *                 Must be between 0 and 23.5.
     */
    public void putHalfHourTask(Double startHour, String taskName){
        this.todaySchedule.put(startHour, taskName);
    }
}
