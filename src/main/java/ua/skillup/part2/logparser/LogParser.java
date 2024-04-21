package ua.skillup.part2.logparser;

import java.time.LocalDateTime;
import java.util.regex.Pattern;

public class LogParser {
    private final LogEntry[] logEntries;

    private LogParser(LogEntry[] logEntries) {
        this.logEntries = logEntries;
    }

    public static LogParser fromLog(String log) {
        //regular expression from keys \[(.*?)\] \[(.*?)\] \[(.*?) (.*?)\] (.*)
        //changed regular \[(.*)\] \[(.*)\] \[(.*) (.*)\] (.*)
        Pattern pattern = Pattern.compile("\\[(.*)\\] \\[(.*)\\] \\[(.*) (.*)\\] (.*)");
        String[] lines = log.split("\n");
        LogEntry[] logEntries = new LogEntry[lines.length];
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            var matcher = pattern.matcher(line);
            if (matcher.find()) {
                LocalDateTime dateTime = LocalDateTime.parse(matcher.group(1));
                LogLevel logLevel = LogLevel.valueOf(matcher.group(2));
                String clientName = String.valueOf(matcher.group(3));
                String clientIP = String.valueOf(matcher.group(4));
                String message = String.valueOf(matcher.group(5));
                logEntries[i] = new LogEntry(dateTime, logLevel, clientName, clientIP, message);
            }
        }


        return new LogParser(logEntries);
    }

    public LogEntry[] filterByLevel(LogLevel level) {
        LogEntry[] filtered = new LogEntry[logEntries.length];

        int count = 0;
        for (LogEntry logEntry : logEntries) {
            if (logEntry.getLevel() == level) {
                filtered[count++] = logEntry;
            }
        }

        LogEntry[] result = new LogEntry[count];
        for (int i = 0; i < count; i++) {
            result[i] = filtered[i];
        }
        return result;
    }

    public LogEntry[] logEntriesAfter(LocalDateTime dateTime) {
        LogEntry[] filtered = new LogEntry[logEntries.length];
        int count = 0;
        for (LogEntry logEntry : logEntries) {
            if (logEntry.getDateTime().isAfter(dateTime)) {
                filtered[count++] = logEntry;
            }
        }

        LogEntry[] result = new LogEntry[count];
        for (int i = 0; i < count; i++) {
            result[i] = filtered[i];
        }
        return result;
    }
}
