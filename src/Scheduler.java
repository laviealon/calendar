import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Scheduler {



    /**
     * Take a NonFixedTask and find the best (first available) time slot for it in the week.
     * Set that task's start time and duration to this best time slot and return it.
     *
     * Time slots do *not* include overlaps between days.
     * @param week: the Week to schedule the task into.
     * @param task: the Task to be scheduled.
     * @return the task with its updated time slot.
     */
    // TODO: implement this method.
    public static NonFixedTask ScheduleTaskInWeek(Week week, Task task){
        // algorithm to find best time slot in this week
        boolean scheduled = false;

        for(Day day: week.days){

        }
        return null;
    }

    /**
     * Take a NonFixedTask and find the best (first available) time slot for it in a day.
     * Set that task's start time and duration to this best time slot and return it.
     *
     * @param week: the Week to schedule the task into.
     * @param task: the Task to be scheduled.
     * @return the task with its updated time slot.
     */
    // TODO: implement this method.
    public static NonFixedTask ScheduleTaskInDay(Week week, Task task){
        // algorithm to find best time slot in this day, to be used by ScheduleProject
        return null;
    }

    /**
     * Take an array of NonFixedTasks and find the best (first available) time slot for each one in the given
     * frequency, which is in times per week (FOR PHASE 0, ASSUME THIS IS 7).
     * Set each of these task's start time and duration to this best time slot and return the same array with
     * all the updated tasks.
     *
     * @param week: the Week to schedule the tasks into.
     * @param projectTasks: the Tasks to be scheduled.
     * @return the task with its updated time slot.
     */
    // TODO: implement this method.
    public static NonFixedTask[] ScheduleProject(Week week, NonFixedTask[] projectTasks){
        return null;
    }

}
