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

    public static boolean checkFixedTaskScheduling(Week week,FixedTask taskToSchedule){
        return Checker.CheckScheduleFixedTask(week, taskToSchedule);
    }

    public static boolean checkNonFixedTaskScheduling(Week week,NonFixedTask taskToSchedule){
        return Checker.CheckScheduleNonFixedTask(week, taskToSchedule);
    }

    public static boolean checkProjectScheduling(Week week,NonFixedTask[] projectToSchedule){
        return Checker.CheckScheduleProject(week, projectToSchedule);
    }

    public static double timeToRemoveFixedTask(Week week, FixedTask taskToSchedule){
        return Modifier.GetHoursRemoveFixedTask(week, taskToSchedule);
    }

    /** Initiates scheduling and putting of fixed task if user chooses to add one to their schedule in UI
     *
     * @param week: the week that the task is being put into
     * @param taskToPut: the FixedTask that is put into week
     */
    public static void activateFixedTaskScheduling(Week week, FixedTask taskToPut){
        Putter.putTask(week, taskToPut);
    }

    /**
     * Initiate scheduling and putting of a non-fixed task if the user chooses to add one to their schedule in UI
     * @param week: the week that the task is being put into
     * @param taskToSchedule: the NonFixedTask that is put into week
     */
    public static void activateNonFixedTaskScheduling(Week week, NonFixedTask taskToSchedule){
        NonFixedTask NonFixedTaskToPut = Scheduler.ScheduleTaskInWeek(week, taskToSchedule);
        Putter.putTask(week, NonFixedTaskToPut);
    }

    /**
     * Initiate scheduling and putting of project based on user preferences
     * @param week: the week that the project is being put into
     * @param projectTasksToSchedule: the project that is put into week
     */
    public static void activateProjectScheduling(Week week, NonFixedTask[] projectTasksToSchedule){
//
        NonFixedTask[] projectTasksToPut = Scheduler.ScheduleProject(week, projectTasksToSchedule);
        Putter.putProject(projectTasksToPut[0].getName(), week, projectTasksToPut);
    }

}
