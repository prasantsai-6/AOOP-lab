class Log {
    private static Log instance;

    private Log() {}

    public static Log getInstance() {
        if (instance == null) {
            instance = new Log();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Log logger = Log.getInstance();
        logger.log("Application started.");
        logger.log("An error occurred.");
    }
}
