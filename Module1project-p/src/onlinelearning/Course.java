package onlinelearning;

public abstract class Course {
    protected String title;
    public Course(String title) { this.title = title; }
    public String getTitle() { return title; }
    public abstract void start();
    public abstract void complete();
}
