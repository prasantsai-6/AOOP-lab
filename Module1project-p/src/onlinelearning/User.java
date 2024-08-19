package onlinelearning;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Course> enrolledCourses = new ArrayList<>();

    public User(String name) { this.name = name; }

    public void enroll(Course course) {
        enrolledCourses.add(course);
        System.out.println(name + " enrolled in " + course.getTitle());
    }

    public void trackProgress(CourseProgress progress) {
        progress.start();
        progress.complete();
    }
}
