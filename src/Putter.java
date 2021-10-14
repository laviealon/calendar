public class Putter {

    // TODO: REQUIRED FOR WALKTHROUGH - DO NOT NEED TO HANDLE CASE WHERE TASK OVERLAPS DAY.
    public static void putTask(Task task){
        // loop through half-hours and put them into the correct day using Day.putHalfHourTask.
    }


    /**
     * Puts a half-hour of a task into a day's .todaySchedule attribute (see README for why the word "put" is used here).
     * The reason we schedule one hour of a task at a time is twofold: (1) this.todaySchedule comprises
     * distinct half-hour intervals, and (2) if a task crosses over multiple days,
     * different half-hours will need to be scheduled onto different days.
     *
     * @param taskName: the name of the task which the hour that is to be scheduled is in.
     * @param startHour: the half-hour that marks the beginning of this hour of a task.
     *                 Must be between 0 and 23.5.
     */
    protected void putHalfHourTask(Day day, Double startHour, String taskName){
        day.todaySchedule.put(startHour, taskName);
    }

    // TODO: REQUIRED FOR WALKTHROUGH.
    public static void putProject(String projectName, Week week, NonFixedTask[] tasks){}
}
