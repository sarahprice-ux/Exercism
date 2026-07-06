public class LogLine {
    private LogLevel logLevel;
    private String rawLogLine;



    public LogLine(String logLine) {
        this.rawLogLine = logLine;
        String message = logLine.substring(0,5);


       this.logLevel = switch (message) {
            case "[TRC]" -> LogLevel.TRACE;
            case "[DBG]" ->LogLevel.DEBUG;
            case "[INF]" ->LogLevel.INFO;
            case "[WRN]" ->LogLevel.WARNING;
            case "[ERR]" ->LogLevel.ERROR;
            case "[FTL]" ->LogLevel.FATAL;

           default -> LogLevel.UNKNOWN;
       };
    }

    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    public String getOutputForShortLog() {
        return this.logLevel.getLogNumber() +":" + this.rawLogLine.substring(7);
    }
}
