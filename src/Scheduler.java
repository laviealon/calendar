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
    // before we start this method, we know:
    // - duration
    // - dueDate
    // - todaySchedule
    public static NonFixedTask ScheduleTaskInDay(Week week, Task task){
        // find earliest available time in day for this task:
        // - create empty list
        // - iterate through todaySchedule and add all times (keys) with value '' to list
        // i = 0
        // try and schedule task in this slot:
        // - check for length of time in a row, by seeing if two adjacent list items are 0.5 hrs apart
        // while list[i+1] - list[i] = 0.5:
        // - once have length of free time (=window), check if window >= duration
        //  - if true, assign start of window as startTime
        //  - if false, get rid of record of this window and go back to iterating through list
        //      i += all the indexes we've already seen
        return null;
        // mutate task object so that startTime and duration now echo where we want to schedule this task
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
