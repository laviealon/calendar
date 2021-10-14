import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

// comment
public class Project {

    /**
     *
     * @param week
     * @param startDate
     * @param dueDate
     * @param totalHours
     * @param frequency
     * @return the minimum number of hours user must work on project per frequency to complete it in time. If
     *  there is not enough space in their week, return 0.0.
     */
    public static double calculateMinHours(Week week, LocalDate startDate, LocalDate dueDate, double totalHours, double frequency) {
        double idealChunk = getIdealChunk(startDate, dueDate, totalHours, frequency);
        boolean fitSchedule = fitSchedule(week, idealChunk);
        if (fitSchedule) {
            return idealChunk;
        }
        return 0.0;
    }

    public static double getIdealChunk(LocalDate startDate, LocalDate dueDate, double totalHours, double frequency){
        long diff = ChronoUnit.DAYS.between(startDate, dueDate);
        double slots = diff*(frequency/7);
        double idealChunk = totalHours/slots;
        return Math.max(idealChunk, 0.5);
    }

    public static boolean fitSchedule(Week week, double idealChunk){
        for(Day n: week.days){
            double maxDay = calculateMaxHoursDay(n);
            if (maxDay < idealChunk) {
                return false;}}
        return true;
    }

    //Should this method be in class week?
    //Not sure if it should return the max hour (chunk) of the week (Mon:3hrs, Tue-Fri:2hrs, return 3) or return the
    //max hours that can fit into each day (Mon:3hrs, Tue-Fri:2hrs, return 2).
    public static double calculateMaxHoursWeek(Week week) {
        double maxHour = 0.0d;
        for(Day n: week.days){
            double maxDay = calculateMaxHoursDay(n);
            if(maxHour < maxDay){maxHour = maxDay;}}
        return maxHour;
    }

    //Should the method be in class Day?
    //Not sure about how abstract class works sorry.
    public static double calculateMaxHoursDay (Day day){
        double maxHour = 0.0d;
        List<Double> startTime = new ArrayList<>(day.todaySchedule.keySet());
        for(int i = 0; i < startTime.size(); i++){
            double freeSlot;
            if(i < startTime.size() - 1) {
            freeSlot = startTime.get(i + 1) - startTime.get(i) -0.5;}
            else{freeSlot = 24 - startTime.get(i) -0.5;}
            if(freeSlot > maxHour) {maxHour = freeSlot;}}
        return maxHour;
        }
    }

