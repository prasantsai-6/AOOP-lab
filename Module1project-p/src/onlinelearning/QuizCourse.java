package onlinelearning;

public class QuizCourse extends Course {
    public QuizCourse(String title) { super(title); }
    public void start() { System.out.println("Starting quiz course: " + title); }
    public void complete() { System.out.println("Completing quiz course: " + title); }
}
