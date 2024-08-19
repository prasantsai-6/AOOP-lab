package onlinelearning;

public class Main {
    public static void main(String[] args) {
        // Create courses using the Factory Method
        Course videoCourse = CourseFactory.createCourse("video", "Java Basics");
        Course textCourse = CourseFactory.createCourse("text", "Design Patterns");
        Course quizCourse = CourseFactory.createCourse("quiz", "Java Certification Quiz");

        // Create a user
        User user = new User("Alice");

        // Enroll the user in courses
        user.enroll(videoCourse);
        user.enroll(textCourse);
        user.enroll(quizCourse);

        // Track progress for the video course
        CourseProgress progress = new CourseProgress();
        user.trackProgress(progress);

        // Demonstrate state transitions
        System.out.println("\nProgressing through the course:");
        progress.start();     // Transition to InProgressState
        progress.complete();  // Transition to CompletedState

        // Attempt to restart the completed course (should not allow)
        progress.start();
        progress.complete();
    }
}
