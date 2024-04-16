package ua.skillup.part2;

import org.testng.annotations.Test;
import ua.skillup.part2.logparser.LogEntry;
import ua.skillup.part2.logparser.LogLevel;
import ua.skillup.part2.logparser.LogParser;

import java.time.LocalDateTime;
import java.util.StringJoiner;

import static org.testng.Assert.assertEquals;

public class LogParserTests {


    final LogEntry[] LOG_ENTRIES = {
            new LogEntry(LocalDateTime.of(2024, 1, 1, 12, 0, 0, 0), LogLevel.ERROR, "local", "192.168.0.1", "A critical error occurred"),
            new LogEntry(LocalDateTime.of(2024, 1, 2, 12, 0, 0, 0), LogLevel.INFO, "server", "221.0.0.1", "User logged in"),
            new LogEntry(LocalDateTime.of(2024, 1, 3, 12, 0, 0, 0), LogLevel.DEBUG, "local", "192.168.0.1", "One more debug message"),
            new LogEntry(LocalDateTime.of(2024, 1, 4, 12, 0, 0, 0), LogLevel.ERROR, "server42", "1.0.0.23", "Server is running out of disk space")
    };

    final String LOG = new StringJoiner("\n")
            .add(LOG_ENTRIES[0].toString())
            .add(LOG_ENTRIES[1].toString())
            .add(LOG_ENTRIES[2].toString())
            .add(LOG_ENTRIES[3].toString())
            .toString();

    @Test
    public void testGetErrorLogs() {
        LogParser parser = LogParser.fromLog(LOG);
        assertEquals(parser.filterByLevel(LogLevel.ERROR), new LogEntry[] {LOG_ENTRIES[0], LOG_ENTRIES[3]});
    }

    @Test
    public void testGetInfoLogs() {
        LogParser parser = LogParser.fromLog(LOG);
        assertEquals(parser.filterByLevel(LogLevel.INFO), new LogEntry[] {LOG_ENTRIES[1]});
    }

    @Test
    public void testGetTraceLogs() {
        LogParser parser = LogParser.fromLog(LOG);
        assertEquals(parser.filterByLevel(LogLevel.TRACE), new LogEntry[0]);
    }
}
