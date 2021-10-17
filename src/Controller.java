import java.time.LocalDate;

public class Controller {
    @SuppressWarnings("InfiniteLoopStatement")
    public static void activateCreateOrImport(int selection, LocalDate startDate, int selectionForScheduling, FixedTask taskToPut, NonFixedTask taskToSchedule){
        if (selection == 1) {
            Week week = new Week(startDate);
            while(true){
                activateScheduling(week, selectionForScheduling, taskToPut, taskToSchedule);
            }
        } else if (selection == 2) {
            System.out.println("This feature is not currently available.");
        } else {
            System.out.println("Please enter a valid option (1 or 2).");
        }
    }

    public static void activateScheduling(Week week, int selection, FixedTask taskToPut, NonFixedTask taskToSchedule){
        if (selection == 1){

            Putter.putTask(week, taskToPut);
        } else if (selection == 2) {

            NonFixedTask NonFixedTaskToPut = Scheduler.ScheduleTaskInWeek(week, taskToSchedule);
            Putter.putTask(week, NonFixedTaskToPut);
        } else if (selection == 3) {
            NonFixedTask[] projectTasksToSchedule = UserInterface.createProject(week);
            NonFixedTask[] projectTasksToPut = Scheduler.ScheduleProject(week, projectTasksToSchedule);
            Putter.putProject(projectTasksToPut[0].name, week, projectTasksToPut);
        } else {
            System.out.println("Please enter a valid option (1, 2, or 3).");
        }

    }
}
