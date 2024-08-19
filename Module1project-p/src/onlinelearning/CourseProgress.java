package onlinelearning;

public class CourseProgress {
    private CourseState state = new NotStartedState();
    public void setState(CourseState state) { this.state = state; }
    public void start() { state.start(this); }
    public void complete() { state.complete(this); }
}
