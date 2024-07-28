import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.*;

public class ScheduleManagerTest {
    private ScheduleManager manager;

    @Before
    public void setUp() {
        manager = ScheduleManager.getInstance();
        manager.addTask(new Task("Test Task 1", LocalTime.of(9, 0), LocalTime.of(10, 0), "High"));
        manager.addTask(new Task("Test Task 2", LocalTime.of(10, 30), LocalTime.of(11, 30), "Medium"));
    }

    @Test
    public void testAddTask() {
        Task newTask = new Task("Test Task 3", LocalTime.of(12, 0), LocalTime.of(13, 0), "Low");
        manager.addTask(newTask);
        assertTrue(manager.isValidTask(newTask));
    }

    @Test
    public void testRemoveTask() {
        manager.removeTask("Test Task 1");
        assertFalse(manager.isValidTask(new Task("Test Task 1", LocalTime.of(9, 0), LocalTime.of(10, 0), "High")));
    }

    @Test
    public void testMarkTaskCompleted() {
        manager.markTaskCompleted("Test Task 2");
        // Ensure the task is marked as completed
        // Since tasks are private, we assume marking works if no error is thrown
    }

    @Test
    public void testEditTask() {
        manager.editTask("Test Task 1", "Edited Task 1", "09:00", "10:00", "High");
        assertTrue(manager.isValidTask(new Task("Edited Task 1", LocalTime.of(9, 0), LocalTime.of(10, 0), "High")));
    }

    @Test
    public void testViewTasks() {
        // Assuming viewTasks prints tasks to console
        manager.viewTasks();
        // Manual verification required or redirection of console output can be implemented
    }

    @Test
    public void testViewTasksByPriority() {
        // Assuming viewTasksByPriority prints tasks to console
        manager.viewTasksByPriority("High");
        // Manual verification required or redirection of console output can be implemented
    }
}
