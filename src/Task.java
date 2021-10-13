import java.time.LocalDateTime;

public class Task {
    public String name;
    public LocalDateTime startTime;
    public double duration;
    public boolean completed;

    /**
     * Constructor to be used by NonFixedTasks.
     *
     * @param name: name of this task
     * @param duration: duration of this task
     */
    public Task(String name, double duration){
        this.name = name;
        this.duration = duration;
        this.startTime = LocalDateTime.of(0, 0, 0, 0, 0, 0);
        completed = false;
    }

    /**
     * Constructor to be used by FixedTasks.
     *
     * @param name: name of this task
     * @param startTime: start date and time of this task
     * @param duration: duration of this task
     */
    public Task(String name, LocalDateTime startTime, double duration){
        this.name = name;
        this.duration = duration;
        this.startTime = startTime;
        completed = false;
    }

    /**
     * Completes this task.
     */
    public void complete(){
        this.completed = true;
    }

    // want to implement a "schedule" method which takes a task and a time slot and places the task
    // into that time slot.
}
