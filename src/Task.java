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
     * Completes this task by modifying its 'completed' attribute
     */
    public void complete(){
        this.completed = true;
    }

    public String getName() {
        return name;
    }

    public void changeName(String newName) {
        name = newName;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void changeStartDateTime(LocalDateTime time) {
        startDateTime = time;
    }

    // want to implement a "schedule" method which takes a task and a time slot and places the task
    // into that time slot.

    // methods for updating task objects:


    /**
     * modify the task's start time
     * @param task
     * @param newStartDateTime
     */
    public void changeTaskStartTime (Task task, LocalDateTime newStartDateTime) {
        task.startDateTime = newStartDateTime;
    }

    /**
     * modify the task's duration
     * @param task
     * @param newDuration
     */
    public void changeTaskDuration(Task task, LocalTime newDuration) {
        task.duration = newDuration;
    }
}
