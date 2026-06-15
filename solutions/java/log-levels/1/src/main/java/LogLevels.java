//import static java.lang.String.indexOf;

public class LogLevels {
    
    public static String message(String logLine) {
        int messageIndex = logLine.indexOf(":");
       return logLine.substring(messageIndex + 1).strip();
    }


    public static String logLevel(String logLine) {

        int messageIndex = logLine.indexOf('[');
        int messageIndex2 = logLine.indexOf(']');
        return logLine.substring(messageIndex + 1, messageIndex2).toLowerCase();



    }

    public static String reformat(String logLine) {
        return (message(logLine) +" ("+ logLevel(logLine)+")");
    }
}
