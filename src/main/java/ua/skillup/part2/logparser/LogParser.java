package ua.skillup.part2.logparser;

import java.time.LocalDateTime;

public class LogParser {
    private final LogEntry[] logEntries;

    private LogParser (LogEntry[] logEntries) {
        this.logEntries = logEntries;
    }

    public static LogParser fromLog(String log) {
        return new LogParser(null);
    }

    public LogEntry[] filterByLevel(LogLevel level) {
        return null;
    }

    public LogEntry[] logEntriesAfter(LocalDateTime dateTime) {
        return null;
    }
}
