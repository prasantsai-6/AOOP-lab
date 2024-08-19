package onlinelearning;


class CompletedState implements CourseState {
    public void start(CourseProgress progress) {
        System.out.println("Course already completed.");
    }
    public void complete(CourseProgress progress) {
        System.out.println("Course already completed.");
    }
}