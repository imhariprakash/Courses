package src;

public class ExceptionHandler {
    private ExceptionHandler() {
        // to prevent instantiation
    }

    public  static void handleException(Exception e, String message) {
        System.out.println(message + " : " + e.getMessage());
    }

    public static void handleException(String message) {
        System.out.println(message);
    }
}
