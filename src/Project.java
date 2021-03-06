import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public interface Project {

    /** Calculate the minimum number of hours in a week that a user must work on their project per given frequency, so
     * that the project can be finished before the due date
     *
     * @param week: the week the project is going to be scheduled in
     * @param startDate: The day the project will be started
     * @param dueDate: The day that the project will need to be finished by
     * @param totalHours: The total number of hours that the project will be worked on
     * @param frequency: The number of times the project will be worked on during the week
     * @return the minimum number of hours user must work on project per frequency to complete it in time. If
     *  there is not enough space in their week, return 0.0.
     */
    static double calculateMinHours(Week week, LocalDate startDate, LocalDateTime dueDate, double totalHours,
                                    double frequency) {
        //return 0.0 if the ideal working time per day does not fit into the user's current schedule, else return
        //idealChunk
        //get the idealChunk
        double idealChunk = getIdealChunk(startDate, dueDate, totalHours, frequency);
        //check if the idealChunk fits in the schedule
        boolean fitSchedule = fitSchedule(week, idealChunk);
        if (fitSchedule) {
            return idealChunk;
        }
        return 0.0;
    }

    /** Finds the ideal chunk of time that a user must work on a project per day and returns the number of hours
     *
     * @param startDate: The day the project will be started on
     * @param dueDate: The day that the project needs to be completed by
     * @param totalHours: The total hours that the project will be worked on
     * @param frequency: the number of times in a week that a project will be worked on
     * @return The ideal chunk of time in hours a user must work on a project per day. If there is no ideal chunk, return 0.5
     */
     static double getIdealChunk(LocalDate startDate, LocalDateTime dueDate, double totalHours, double frequency){
        //Get the number of days between startDate and dueDate
        long diff = ChronoUnit.DAYS.between(startDate, dueDate);
        //Calculate the number of slots needed to work on the task based on user input frequency;
        double slots = diff*(frequency/7);
        //Get the ideal number of slots needed to complete the task
        double idealChunk = totalHours/slots;
        //Ideal chunk for each slot
        return Math.max(idealChunk, 0.5);
    }

    /** Finds whether the given chunk of time is available in all the days in the given week
     *
     * @param week: The week that is checked to see if the idealChunk is able to fit into each day
     * @param idealChunk: The ideal chunk of time that a user must work on a project per day
     * @return true if the idealChunk is less than or equal to the maximum free timeslot of all the days in the week.
     * If there is at least one day that does not have enough time, then return false
     */
     static boolean fitSchedule(Week week, double idealChunk){
        //Check if each day has enough time for idealChunk
        for(Day n: week.getDays()){
            //get the maximum free timeslot fpr each day in the week
            double maxDay = calculateMaxHoursDay(n);
            //if the maximum free timeslot for each day is less than the idealChunk
            //return false, else return true.
            if (maxDay < idealChunk) {
                return false;}}
        return true;
    }

    /** Finds the maximum number of hours that are available in all days of the given week
     *
     * @param week: The week that is being checked to see the max timeslots that are available for all days
     * @return the maximum hours that are available for all days in the given week
     */
     static double calculateMaxHoursWeek(Week week) {
        //set variable maxHour
        double maxHour = 0.0;
        //iterate through each day in the week to find the maximum free timeslot
        //of the week
        for(Day n: week.getDays()){
            //find the maximum free timeslot of each day in a week, assign it to variable maxDay
            double maxDay = calculateMaxHoursDay(n);
            //if the maximum timeslot of the day is greater than maxHour, replace maxHour with maxDay
            if(maxHour < maxDay){maxHour = maxDay;}}
        return maxHour;
    }


    /** Calculates the maximum number of hours that are available in the given day
     *
     * @param day: The day that the max number of free timeslots are being found in
     * @return the maximum number of hours that are available in the given day
     */
     static double calculateMaxHoursDay (Day day){
        //set variable maxHour and currentMax
        double maxHour = 0.0;
        double currentMax = 0.0;
        //create a list of values in todaySchedule
        List<String> task = new ArrayList<>(day.getTodaySchedule().values());
        //loop through the list
        for (String s : task) {
            //if there is no task assigned to this time (empty string)
            //add 0.5 to currentMax
            if (Objects.equals(s, "")) {
                currentMax += 0.5;
                //replace maxHour with currentMax is currentMax > maxHour
                if (currentMax > maxHour) {
                    maxHour = currentMax;
                }
                //if there is task assigned to this time, reset currentMax to 0
            } else {
                currentMax = 0.0;
            }
        }
        return maxHour;
    }

    /**
     * Get info from user about the project they want to schedule, and return an array of NonFixedTasks
     * corresponding to the project.
     *
     * @return an array of unscheduled NonFixedTasks corresponding to this project.
     */
    static NonFixedTask[] createProject(Week week){
        Scanner reader = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What is the name of your project or goal?");
        String name = reader.nextLine(); // Get user input
        System.out.println("What date do you want to start working on this project or goal?");
        System.out.println();
        System.out.println("(Please enter date in format YYYY-MM-DD)");
        String startDateStr = reader.nextLine(); // Get user input
        int year = Integer.parseInt(startDateStr.substring(0, 4));
        int month = Integer.parseInt(startDateStr.substring(5, 7));
        int day = Integer.parseInt(startDateStr.substring(8, 10));
        LocalDate startDate = LocalDate.of(year, month, day);
        System.out.println("What date is this project or goal due by?");
        System.out.println();
        System.out.println("(Please enter date in format YYYY-MM-DD)");
        String dueDateStr = reader.nextLine(); // Get user input
        year = Integer.parseInt(dueDateStr.substring(0, 4));
        month = Integer.parseInt(dueDateStr.substring(5, 7));
        day = Integer.parseInt(dueDateStr.substring(8, 10));
        System.out.println("At what time on that day is your project or goal due before?");
        System.out.println();
        System.out.println("(Please enter time in format HH:MM, where HH ranges from 00 to 23 and" +
                " where MM is either 00 or 30)");

        String startTime = reader.nextLine();  // Get user input
        int hour = Integer.parseInt(startTime.substring(0, 2));
        int minute = Integer.parseInt(startTime.substring(3, 5));
        LocalDateTime dueDate = LocalDateTime.of(year, month, day, hour, minute);
        System.out.println("What is the total number of hours you would like to work on this project? (round to the" +
                " nearest 0.5)");
        double totalHours = Double.parseDouble(reader.nextLine());
        double minHours = Project.calculateMinHours(week, startDate, dueDate, totalHours, Constants.FREQUENCY);
        // Create case to handle when minHours is 0.0
        double maxHours = Project.calculateMaxHoursWeek(week);
        System.out.println("You must work on this project at least " + minHours + " per day and at most " + maxHours +
                " per day.");
        System.out.println("Please enter the maximum amount of time you would like to work on this project in a given" +
                "day. Enter a time formatted as HH:MM, where HH and MM are between that of the minimum and maximum" +
                "shown above.");
        String input = reader.nextLine();
        int hours = Integer.parseInt(input.substring(0, 2));
        int minutes = Integer.parseInt(input.substring(3, 5));
        LocalTime maxHoursPerTask = LocalTime.of(hours, minutes);
        NonFixedTask[] projectTasks = new NonFixedTask[Constants.FREQUENCY];
        for(int i = 0; i <= 7; i++){
            projectTasks[i] = new NonFixedTask(name, dueDate, maxHoursPerTask);
        }
        return projectTasks;
    }
}

