import java.time.LocalDateTime;

public class Putter {

    // TODO: REQUIRED FOR WALKTHROUGH - DO NOT NEED TO HANDLE CASE WHERE TASK OVERLAPS DAY.



    public static void putTask(Week week, Task task){
        // loop through half-hours and put them into the correct day using Day.putHalfHourTask.
        LocalDateTime taskStart = task.startDateTime;
        for (Day day: week.days) {
            // find the day this task starts in this week
            if (taskStart.toLocalDate().isEqual(day.dayOfMonth)) {
                //convert task duration to double
                int hour = task.duration.getHour();
                int minute = task.duration.getMinute();
                double minuteDouble = ((double)minute/60);
                //calculate the number of half hour block represented by the minute
                double minuteBlock = minuteDouble/0.5;
                //calculate total number of half hour blocks in the task duration
                int totalTaskBlock = hour*2 + (int) minuteBlock;
                //convert the start time of task to double
                double h = task.startDateTime.getHour();
                double m = (double)(task.startDateTime.getMinute())/60;
                double startTimeD = h + m;
                //loop through todaySchedule and mutate the value of the corresponding
                int i = 0;
                while (i < totalTaskBlock) {
                    day.todaySchedule.replace(startTimeD + 0.5*i, task.name);
                    i ++;
                }
                // find the start time of the task in the day
            }
        }
    }



    /**
     * Puts a half-hour of a task into a day's .todaySchedule attribute (see README for why the word "put" is used here).
     * The reason we schedule one hour of a task at a time is twofold: (1) this.todaySchedule comprises
     * distinct half-hour intervals, and (2) if a task crosses over multiple days,
     * different half-hours will need to be scheduled onto different days.
     *
     *taskName: the name of the task which the hour that is to be scheduled is in.
     * startHour: the half-hour that marks the beginning of this hour of a task.
     *                 Must be between 0 and 23.5.
     */
    //protected void putHalfHourTask(Week week, Day day, Double startHour, String taskName){
        //day.todaySchedule.put(startHour, taskName);
    //}

    // TODO: REQUIRED FOR WALKTHROUGH.
    public static void putProject(String projectName, Week week, NonFixedTask[] tasks){
        for (NonFixedTask task : tasks) {
            task.name = projectName;
            putTask(week, task);
        }

    }
}
