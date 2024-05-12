package ua.skillup.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {
    public static int countWords(String text) {
        int count = 0;
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
