import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TaskTest {
    LocalTime duration;
    Task task;
    @Before
    public void setUp() {
        duration = LocalTime.of(4, 30);
        task = new Task("Piano Practice", duration);
        }

    @After
    public void tearDown() {
    }

    @Test
    public void convertDurationDouble() {
        double convertedDuration = task.convertDurationDouble();
        double expected = 4.5;
        assertEquals(expected, convertedDuration, 0.01);
    }

    @Test
    public void complete() {
        task.complete();
        assertTrue(task.completed);
    }
}