/**
 * Class Week contains seven days.
 * Represents a user's week and contains the data regarding all of their tasks.
 */
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Week {
    public Day[] days;

    public Week(LocalDate startDate, DayOfWeek startDay){
        // initialize <days> to an empty array of 7 days
        days = new Day[7];
        // set each element of <days> to its corresponding day, starting with days[0] = new Day(startDate, startDay).
        for(int i = 0; i <= 6; i++){
            days[i] = new Day(startDate.plusDays(i));
        }
    }

}
