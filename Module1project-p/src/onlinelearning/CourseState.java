package onlinelearning;

interface CourseState {
    void start(CourseProgress progress);
    void complete(CourseProgress progress);
}