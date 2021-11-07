import java.time.LocalDate;

public class Controller {


    /** Instantiate a week object to be populated by input from the User Interface
     *
     * @param startDate: The day that the week will start
     * @return returns a Week object, with the given start day
     */
    public static Week activateInstantiateWeek(LocalDate startDate){
        return InstantiateWeek.instantiateWeek(startDate);
    }

    /** Initiates scheduling and putting of fixed task if user chooses to add one to their schedule in UI
     *
     * @param week: the week that the task is being put into
     * @param taskToPut: the FixedTask that is put into week
     */
    public static void activateFixedTaskScheduling(Week week, FixedTask taskToPut){
        Putter.putTask(week, taskToPut);
    }

    public static void activateNonFixedTaskScheduling(Week week, NonFixedTask taskToSchedule){
        NonFixedTask NonFixedTaskToPut = Scheduler.ScheduleTaskInWeek(week, taskToSchedule);
        Putter.putTask(week, NonFixedTaskToPut);
    }

    // initiate scheduling and putting of project based on user preferences

    public static void activateProjectScheduling(Week week, NonFixedTask[] projectTasksToSchedule){
//
        NonFixedTask[] projectTasksToPut = Scheduler.ScheduleProject(week, projectTasksToSchedule);
        Putter.putProject(projectTasksToPut[0].getName(), week, projectTasksToPut);
    }

}
