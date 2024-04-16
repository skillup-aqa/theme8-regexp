package ua.skillup.part2.logparser;

import java.time.LocalDateTime;

public class LogEntry {
    private final LocalDateTime dateTime;
    private final LogLevel level;
    private final String clientName;
    private final String clientIp;
    private final String message;


    public LogEntry(LocalDateTime dateTime, LogLevel level, String clientName, String clientIp, String message) {
        this.dateTime = dateTime;
        this.level = level;
        this.clientName = clientName;
        this.clientIp = clientIp;
        this.message = message;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public LogLevel getLevel() {
        return level;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientIp() {
        return clientIp;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return String.format("[%s] [%s] [%s %s] %s", dateTime.toString(), level, clientName, clientIp, message);
    }
}
