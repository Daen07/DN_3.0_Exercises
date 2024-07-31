package SingletonPattern;

public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Verify both logger1 and logger2 are the same instance
        System.out.println(logger1 == logger2); // Should print true

        logger1.log("This is a log message.");
    }
}
