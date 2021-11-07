import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task {
    private String name;
    private LocalDateTime startDateTime;
    private LocalTime duration;
    private boolean completed;

    /**
     * Constructor to be used by NonFixedTasks, giving the task its name and duration
     *
     * @param name: name of this task
     * @param duration: duration of this task
     */
    public Task(String name, LocalTime duration){
        this.name = name;
        this.duration = duration;
        this.startDateTime = LocalDateTime.of(0, 1, 1, 0, 0);
        completed = false;
    }

    /**
     * Constructor to be used by FixedTasks, giving the task its name, start time and duration.
     *
     * @param name: name of this task
     * @param startTime: start date and time of this task
     * @param duration: duration of this task
     */
    public Task(String name, LocalDateTime startTime, LocalTime duration){
        this.name = name;
        this.duration = duration;
        this.startDateTime = startTime;
        completed = false;
    }

    /**
     * Completes this task by modifying its 'completed' attribute to true
     */
    public void complete(){
        this.completed = true;
    }

    /**
     * Gets the name of the task
     * @return the name of the task
     */
    public String getName() {
        return name;
    }

    /**
     * Change the name of the task
     * @param newName: the new name that you would like to rename your task
     */
    public void changeName(String newName) {
        name = newName;
    }

    /**
     * Get the start date and time of the task
     * @return the start date and time of the task
     */
    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    /**
     * Gets the duration of the task
     * @return the duration of the task
     */
    public LocalTime getDuration() {
        return duration;
    }

    /**
     * Checks if the task has been completed or not
     * @return whether the task has been completed
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Changes the start date time of a task, to the given time
     * @param time: The new start day and time of the task
     */
    public void changeStartDateTime(LocalDateTime time) {
        startDateTime = time;
    }

    // want to implement a "schedule" method which takes a task and a time slot and places the task
    // into that time slot.
}
