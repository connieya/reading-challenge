package java_performance_tuning.story10;

public class SimpleLogger {
    private static final boolean printFlag = false;
    public static void log(String message) {
        if (printFlag){
            System.out.println(message);
        }
    }
}
