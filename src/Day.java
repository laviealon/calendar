import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Each day should comprise its date, day, and a map with half-hour intervals as keys and task names as values.
 * The empty string as a value represents no task being scheduled, i.e. free time.
 */

public class Day {
    private LocalDate dayOfMonth;
    private DayOfWeek dayOfWeek;
    private Map<Double, String> todaySchedule;

    /**
     *
     * Construct a Day, giving the day its day of month, day of week and the schedule of the day
     * @param dayOfMonth the day of month
     */

    public Day(LocalDate dayOfMonth){
        this.dayOfMonth = dayOfMonth;
        this.dayOfWeek = dayOfMonth.getDayOfWeek();
        this.todaySchedule = new HashMap<>();
        // Set all initial half-hour blocks to the empty string, which represents
        // no task scheduled (free time)/
        for(double i = 0.0; i <= 23.5; i = i + 0.5){
            this.todaySchedule.put(i, "");
        }
    }

    /**
     * @return the string representation of a day that lists its day of week and schedule.
     */

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("------ ").append(this.dayOfWeek).append(" ------\n");
        for(Double time: this.todaySchedule.keySet()){
            s.append(time).append(": ").append(this.todaySchedule.get(time)).append("\n");
        }
        return(s.toString());
    }

    /**
     * Gets the day of the week
     * @return the day of the week
     */
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Gets the schedule for the day
     * @return today's schedule
     */
    public Map<Double, String> getTodaySchedule(){
        return todaySchedule;
    }

    /**
     * Gets the day of the month
     * @return the day of the month
     */
    public LocalDate getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * Puts a project into the day's schedule
     * @param time: the time of the task to be put into the day's schedule
     * @param name: the name of the task to be put into the day's schedule
     */
    public void putProject(Double time, String name) {
        todaySchedule.replace(time, name);
    }

    /**
     * remove a task from todaySchdule (delete the task)
     * @param day
     * @param task
     */
    public void removeTask(Day day, Task task) {

    }
}
