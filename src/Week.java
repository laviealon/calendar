
import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;

public class Week {
    public Day[] days;

    /**
     *
     * Construct a week, giving the week its start date and an array of days in that week.
     * Class Week contains seven days. It represents a user's week and contains the data regarding all of their tasks.
     * @param startDate the start date of that week.
     */

    public Week(LocalDate startDate){
        // initialize <days> to an empty array of 7 days
        days = new Day[7];
        // set each element of <days> to its corresponding day, starting with days[0] = new Day(startDate, startDay).
        for(int i = 0; i <= 6; i++){
            days[i] = new Day(startDate.plusDays(i));
        }
    }


    /**
     * Return the string representation of a week that lists the start date of the week and the
     * information of each day within the week (each day has a string representation of
     * its day of week and schedule)
     */

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("Week starting on ").append(this.days[0].dayOfWeek).append(", ").append(this.days[0].dayOfMonth).append("\n");
        s.append("-------------------------------------------\n");
        for(Day day: this.days){
            s.append(day.toString());
        }
        return s.toString();
    }

//    public void setSleep(LocalTime sleepTime, LocalTime wakeTime){ // add a fixed task for sleep
//        for (Day day:
//             days) {
//            if (sleepTime.compareTo(wakeTime) > 0){
//                Scheduler.ScheduleTaskInWeek(this, new FixedTask("sleep",
//                        new LocalDateTime(new LocalDate(0, 0, day.dayOfMonth),
//                                new LocalTime(0,0,0)),
//                        wakeTime.getHour() + ((double) wakeTime.getMinute()) / 60.0));
//                Scheduler.ScheduleTaskInWeek(this, new FixedTask("sleep",
//                        new LocalDateTime(new LocalDate(0, 0, day.dayOfMonth), sleepTime),
//                        24 - sleepTime.getHour() - ((double) sleepTime.getMinute()) / 60.0));
//            }
//            else{
//                Scheduler.ScheduleTaskInWeek(this, new FixedTask("sleep",
//                        new LocalDateTime(new LocalDate(0, 0, day.dayOfMonth), sleepTime,
//                       sleepTime.getHour() - wakeTime.getHour() - (((double) sleepTime.getMinute() - (double) wakeTime.getMinute()) / 60.0))));
//            }
//        }
//    }


}
