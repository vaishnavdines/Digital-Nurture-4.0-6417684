package Week_1_DesignPatternsAndPrinciples.HandsOn_1_SingletonPatternExample.Code;

public class LoggerTest {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        log1.logMessage("This is the first log.");
        log2.logMessage("This is the second log.");

        if (log1 == log2) {
            System.out.println("Both log1 and log2 are using the same Logger object.");
        } else {
            System.out.println("These are different Logger instances.");
        }
    }
}
