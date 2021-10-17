/**
 * Class Week contains seven days.
 * Represents a user's week and contains the data regarding all of their tasks.
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Week {
    public Day[] days;

    public Week(LocalDate startDate){
        // initialize <days> to an empty array of 7 days
        days = new Day[7];
        // set each element of <days> to its corresponding day, starting with days[0] = new Day(startDate, startDay).
        for(int i = 0; i <= 6; i++){
            days[i] = new Day(startDate.plusDays(i));
        }
    }

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
