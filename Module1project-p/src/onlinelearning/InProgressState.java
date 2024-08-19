package onlinelearning;

class InProgressState implements CourseState {
    public void start(CourseProgress progress) {
        System.out.println("Course already in progress.");
    }
    public void complete(CourseProgress progress) {
        System.out.println("Course completed.");
        progress.setState(new CompletedState());
    }
}
