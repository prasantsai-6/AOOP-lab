package onlinelearning;

public class VideoCourse extends Course {
    public VideoCourse(String title) { super(title); }
    public void start() { System.out.println("Starting video course: " + title); }
    public void complete() { System.out.println("Completing video course: " + title); }
}




