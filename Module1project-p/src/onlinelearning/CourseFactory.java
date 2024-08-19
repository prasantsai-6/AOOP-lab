package onlinelearning;

public class CourseFactory {
    public static Course createCourse(String type, String title) {
        switch (type.toLowerCase()) {
            case "video": return new VideoCourse(title);
            case "text": return new TextCourse(title);
            case "quiz": return new QuizCourse(title);
            default: throw new IllegalArgumentException("Unknown course type");
        }
    }
}
