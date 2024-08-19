package onlinelearning;

public class TextCourse extends Course {
    public TextCourse(String title) { super(title); }
    public void start() { System.out.println("Starting text course: " + title); }
    public void complete() { System.out.println("Completing text course: " + title); }
}
