package ua.skillup.part2;

import ua.skillup.part1.StringValidator;
import ua.skillup.part2.logparser.LogEntry;
import ua.skillup.part2.logparser.LogLevel;
import ua.skillup.part2.logparser.LogParser;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.StringJoiner;

public class CheckPart2Theme8 {
    public static void main(String[] args) {
        System.out.println("HyperText Transfer Protocol: " + AcronymMaker.makeAcronym("HyperText Transfer Protocol"));
        System.out.println("Light Amplification by Stimulated Emission of Radiation: " +
                AcronymMaker.makeAcronym("Light Amplification by Stimulated Emission of Radiation"));
        System.out.println("This is a sentence with seven words: " + WordCounter.countWords("This is a sentence with seven words."));

        System.out.println(Character.isAlphabetic('s'));
        System.out.println(Character.isLowerCase('L') ? 'a' : 'A');
        System.out.println((char) 97);

        System.out.println(CaesarCipher.encrypt("basTion 54 mu", 5));
        System.out.println(CaesarCipher.decrypt(CaesarCipher.encrypt("bastiON 54 mu", 5), 5));


        final LogEntry[] LOG_ENTRIES = {
                new LogEntry(LocalDateTime.of(2023, 1, 1, 12, 0, 0, 0), LogLevel.ERROR, "local", "192.168.0.1", "A critical error occurred"),
                new LogEntry(LocalDateTime.of(2023, 1, 2, 12, 0, 0, 0), LogLevel.INFO, "server", "221.0.0.1", "User logged in"),
                new LogEntry(LocalDateTime.of(2023, 1, 3, 12, 0, 0, 0), LogLevel.DEBUG, "local", "192.168.0.1", "One more debug message"),
                new LogEntry(LocalDateTime.of(2024, 1, 4, 12, 0, 0, 0), LogLevel.ERROR, "server42", "1.0.0.23", "Server is running out of disk space"),
                new LogEntry(LocalDateTime.of(2024, 2, 5, 13, 0, 0, 0), LogLevel.INFO, "Sasha", "1.0.0.25", "Some test message")
        };

        final String LOG = new StringJoiner("\n")
                .add(LOG_ENTRIES[0].toString())
                .add(LOG_ENTRIES[1].toString())
                .add(LOG_ENTRIES[2].toString())
                .add(LOG_ENTRIES[3].toString())
                .add(LOG_ENTRIES[4].toString())
                .toString();

        LogParser parser = LogParser.fromLog(LOG);

        for (LogEntry string : parser.filterByLevel(LogLevel.INFO)) {
            System.out.println(string.toString());

        }
        System.out.println();

        /* with this string representation gradle tests are failing, (I've added in setting Java 17)
        final String LOG02 = """
                [2022-12-03T10:15:30] [INFO] [server 221.0.0.1] User logged in
                [2023-12-03T10:15:30] [INFO] [server 221.0.0.1] User logged in
                [2024-12-03T10:15:30] [INFO] [server 221.0.0.1] User logged in
                [2025-12-03T10:15:30] [INFO] [server 221.0.0.1] User logged in
                [2026-12-03T10:15:30] [INFO] [server 221.0.0.1] User logged in
                [2027-12-03T10:15:30] [INFO] [server 221.0.0.1] User logged in
                """;
          */

        final String LOG02 = new StringJoiner("\n")
                .add("[2022-12-03T10:15:30] [INFO] [server 221.0.0.1] User logged in")
                .add("[2023-12-03T10:15:30] [INFO] [server 221.0.0.1] User logged in")
                .add("[2024-12-03T10:15:30] [INFO] [server 221.0.0.1] User logged in")
                .add("[2025-12-03T10:15:30] [INFO] [server 221.0.0.1] User logged in")
                .add("[2026-12-03T10:15:30] [INFO] [server 221.0.0.1] User logged in")
                .add("[2027-12-03T10:15:30] [INFO] [server 221.0.0.1] User logged in")
                .toString();

        LogParser parser02 = LogParser.fromLog(LOG02);

        for (LogEntry string : parser02.logEntriesAfter(LocalDateTime.of(2025, 1, 1, 12, 0, 0, 0))) {
            System.out.println(string.toString());
        }


    }
}
