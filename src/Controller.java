import java.time.LocalDate;

public class Controller {



    public static Week activateInstantiateWeek(LocalDate startDate){
        return InstantiateWeek.instantiateWeek(startDate);
    }


    public static void activateFixedTaskScheduling(Week week, FixedTask taskToPut){
        Putter.putTask(week, taskToPut);
    }

    public static void activateNonFixedTaskScheduling(Week week, NonFixedTask taskToSchedule){
        NonFixedTask NonFixedTaskToPut = Scheduler.ScheduleTaskInWeek(week, taskToSchedule);
        Putter.putTask(week, NonFixedTaskToPut);
    }

    public static void activateProjectScheduling(Week week, NonFixedTask[] projectTasksToSchedule){
//
        NonFixedTask[] projectTasksToPut = Scheduler.ScheduleProject(week, projectTasksToSchedule);
        Putter.putProject(projectTasksToPut[0].name, week, projectTasksToPut);
    }
}
