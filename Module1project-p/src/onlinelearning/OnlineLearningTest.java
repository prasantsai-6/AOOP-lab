package onlinelearning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OnlineLearningTest {
    
    private Course videoCourse;
    private Course textCourse;
    private Course quizCourse;
    private CourseProgress progress;

    @BeforeEach
    public void setUp() {
        videoCourse = CourseFactory.createCourse("video", "Java Basics");
        textCourse = CourseFactory.createCourse("text", "Design Patterns");
        quizCourse = CourseFactory.createCourse("quiz", "Java Certification Quiz");
        progress = new CourseProgress();
    }

    @Test
    public void testCourseFactory() {
        assertNotNull(videoCourse);
        assertNotNull(textCourse);
        assertNotNull(quizCourse);

        assertEquals("Java Basics", videoCourse.getTitle());
        assertEquals("Design Patterns", textCourse.getTitle());
        assertEquals("Java Certification Quiz", quizCourse.getTitle());
    }

    @Test
    public void testCourseProgressInitialState() {
        assertTrue(progress instanceof CourseProgress);
        assertDoesNotThrow(() -> progress.start());
    }

    @Test
    public void testCourseStateTransition() {
        // Initial state: NotStartedState
        progress.start(); // Transition to InProgressState
        progress.complete(); // Transition to CompletedState
        
        // Test that state does not regress
        progress.start(); // Should print "Course already completed."
        progress.complete(); // Should print "Course already completed."
    }

    @Test
    public void testEnrollAndTrackProgress() {
        User user = new User("John Doe");
        user.enroll(videoCourse);
        
        assertDoesNotThrow(() -> user.trackProgress(progress));
    }
}

