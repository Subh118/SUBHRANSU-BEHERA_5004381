package exercise1;


public class SingletonTest {
    public static void main(String[] args) {
        // Get the Logger instance and log a message
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");
        
        // Get the Logger instance again and log another message
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");
        
        // Verify that both references point to the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("logger1 and logger2 are different instances.");
        }
    }
}
