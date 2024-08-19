package onlinelearning;

class NotStartedState implements CourseState {
    public void start(CourseProgress progress) {
        System.out.println("Course started.");
        progress.setState(new InProgressState());
    }
    public void complete(CourseProgress progress) {
        System.out.println("Cannot complete. Course not started yet.");
    }
}