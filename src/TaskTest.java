import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TaskTest {

    @Before
    public void setUp() {
        }

    @After
    public void tearDown() {
    }

    @Test
    public void convertDurationDouble() {

        LocalTime duration = LocalTime.of(4, 30);
        Task task = new Task("Piano Practice", duration);
        double convertedDuration = task.convertDurationDouble();
        double expected = 4.5;
        assertEquals(expected, convertedDuration, 0.01);
    }

    @Test
    public void complete() {
        LocalTime duration = LocalTime.of(4, 30);
        Task task = new Task("Piano Practice", duration);
        task.complete();
        assertTrue(task.completed);
    }
}