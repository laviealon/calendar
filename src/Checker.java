import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;



public class Checker {

    public static boolean CheckScheduleProject(Week week, NonFixedTask[] projectTask){
        Task[] checkScheduleProject = Scheduler.ScheduleProject(week, projectTask);
        LocalDateTime defaultValue = LocalDateTime.of(0, 1, 1, 0, 0);
        for (Task task : checkScheduleProject) {
            if (task.getStartDateTime().equals(defaultValue)) {
                return false;
            }
        }
        return true;
    }

    public static boolean CheckScheduleNonFixedTask(Week week, NonFixedTask task){
        Task checkScheduleProject = Scheduler.ScheduleTaskInWeek(week, task);
        LocalDateTime defaultValue = LocalDateTime.of(0, 1, 1, 0, 0);
        return !checkScheduleProject.getStartDateTime().equals(defaultValue);
    }

    public static boolean CheckScheduleFixedTask(Week week, FixedTask task) {
        for (Day day: week.getDays()){
            if (task.getStartDateTime().toLocalDate().equals(day.getDayOfMonth())){
                double h = task.getStartDateTime().getHour();
                double m = (double)(task.getStartDateTime().getMinute())/60;
                double startTimeD = h + m;
                if(!day.getTodaySchedule().get(startTimeD).equals("")){
                    return false;
                }
            }
        }
        return true;

    }

}

