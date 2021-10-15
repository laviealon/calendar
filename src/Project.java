import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Project {

    /**
     *
     * @param week: the week the project is going to be scheduled in
     * @param startDate:
     * @param dueDate:
     * @param totalHours:
     * frequency
     * the minimum number of hours user must work on project per frequency to complete it in time. If
     *  there is not enough space in their week, return 0.0.
     */
    public static double calculateMinHours(Week week, LocalDate startDate, LocalDateTime dueDate, double totalHours,
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

    public static double getIdealChunk(LocalDate startDate, LocalDateTime dueDate, double totalHours, double frequency){
        //Get the number of days between startDate and dueDate
        long diff = ChronoUnit.DAYS.between(startDate, dueDate);
        //Calculate the number of slots needed to work on the task base on user input frequency;
        double slots = diff*(frequency/7);
        //Get the idea number of slots needed to complete the task
        double idealChunk = totalHours/slots;
        //Ideal chunk for each slot
        return Math.max(idealChunk, 0.5);
    }

    public static boolean fitSchedule(Week week, double idealChunk){
        //Check if each day has enough time for idealChunk
        for(Day n: week.days){
            //get the maximum free timeslot fpr each day in the week
            double maxDay = calculateMaxHoursDay(n);
            //if the maximum free timeslot for each day is less than the idealChunk
            //return false, else return true.
            if (maxDay < idealChunk) {
                return false;}}
        return true;
    }


    public static double calculateMaxHoursWeek(Week week) {
        //set variable maxHour
        double maxHour = 0.0;
        //iterate through each day in the week to find the maximum free timeslot
        //of the week
        for(Day n: week.days){
            //find the maximum free timeslot of each day in a week, assign it to variable maxDay
            double maxDay = calculateMaxHoursDay(n);
            //if the maximum timeslot of the day is greater than maxHour, replace maxHour with maxDay
            if(maxHour < maxDay){maxHour = maxDay;}}
        return maxHour;
    }


    /**public static double calculateMaxHoursDay (Day day){
        double maxHour = 0.0d;
        List<Double> startTime = new ArrayList<>(day.todaySchedule.keySet());
        for(int i = 0; i < startTime.size(); i++){
            double freeSlot;
            if(i < startTime.size() - 1) {
            freeSlot = startTime.get(i + 1) - startTime.get(i) -0.5;}
            else{freeSlot = 24 - startTime.get(i) -0.5;}
            if(freeSlot > maxHour) {maxHour = freeSlot;}
        return maxHour;
        }
    }

    /**set variable current_max
     * if value for key is empty string add duration of key to maxHour
     * if the next key is also empty string add the duration to maxHour
     * if the next key not empty string
     * compare current max to maxhour
     * if current max is bigger replace maxhour
     */

    public static double calculateMaxHoursDay (Day day){
        //set variable maxHour and currentMax
        double maxHour = 0.0;
        double currentMax = 0.0;
        //create a list of values in todaySchedule
        List<String> task = new ArrayList<>(day.todaySchedule.values());
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
}

