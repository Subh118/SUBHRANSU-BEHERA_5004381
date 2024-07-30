package exercise1;

public class Logger {
    // Private static instance of Logger
    private static Logger instance;
    
    // Private constructor to prevent instantiation
    private Logger() {
        // Initialization code, if any
    }
    
    // Public static method to get the instance of Logger
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    // Example logging method
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}
