import java.time.LocalDate;

public class Controller {
    public static void activateCreateOrImport(int selection){
        if (selection == 1) {
            LocalDate startDate = UserInterface.getStartDate();
            Week week = new Week(startDate);
            while(true){
                int selectionForScheduling = UserInterface.scheduleDuty();
                activateScheduling(week, selectionForScheduling);
            }
        } else if (selection == 2) {
            System.out.println("This feature is not currently available.");
        } else {
            System.out.println("Please enter a valid option (1 or 2).");
        }
    }

    public static void activateScheduling(Week week, int selection){
        if (selection == 1){
            FixedTask taskToPut = UserInterface.createFixedTask();
            Putter.putTask(week, taskToPut);
        } else if (selection == 2) {
            NonFixedTask taskToSchedule = UserInterface.createNonFixedTask();
            NonFixedTask taskToPut = Scheduler.ScheduleTaskInWeek(week, taskToSchedule);
            Putter.putTask(week, taskToPut);
        } else if (selection == 3) {
            NonFixedTask[] projectTasksToSchedule = UserInterface.createProject(week);
            NonFixedTask[] projectTasksToPut = Scheduler.ScheduleProject(week, projectTasksToSchedule);
            Putter.putProject(projectTasksToPut[0].name, week, projectTasksToPut);
        } else {
            System.out.println("Please enter a valid option (1, 2, or 3).");
        }

    }
}
