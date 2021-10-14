import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Project {
    /** Why do we need the week it is scheduling onto?
     * Do we want to return a double or round it up?
     */
    public String name;
    public double totalHours;
    public double frequency;
    public LocalDate startDate;
    public LocalDate dueDate;

    // user interface or controller convert user input into LocalDate object

    public Project(String name, double totalHours, double frequency, LocalDate startDate,
                   LocalDate dueDate){

        this.name = name;
        this.totalHours = totalHours;
        this.frequency = frequency;
        this.startDate = startDate;
        this.dueDate = dueDate;
    }

    public double calculateMinHours() {
        long diff = ChronoUnit.DAYS.between(this.startDate, this.dueDate);
        return this.totalHours/(diff*this.frequency);
    }
}
