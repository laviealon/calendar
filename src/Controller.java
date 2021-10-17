import java.time.LocalDate;

public class Controller {



    public Week activateInstantiateWeek(LocalDate startDate){
        return InstantiateWeek.instantiateWeek(startDate);
    }

//    public static void activateScheduling(Week week, int selection, FixedTask taskToPut, NonFixedTask taskToSchedule){
//        if (selection == 1){
//            Putter.putTask(week, taskToPut);
//        } else if (selection == 2) {
//            NonFixedTask NonFixedTaskToPut = Scheduler.ScheduleTaskInWeek(week, taskToSchedule);
//            Putter.putTask(week, NonFixedTaskToPut);
//        } else if (selection == 3) {
//            NonFixedTask[] projectTasksToSchedule = UserInterface.createProject(week);
//            NonFixedTask[] projectTasksToPut = Scheduler.ScheduleProject(week, projectTasksToSchedule);
//            Putter.putProject(projectTasksToPut[0].name, week, projectTasksToPut);
//        } else {
//            System.out.println("Please enter a valid option (1, 2, or 3).");
//        }
//    }

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
