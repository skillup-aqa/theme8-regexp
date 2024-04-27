package ua.skillup.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {
    public static int countWords(String text) {
        Pattern wordPattern = Pattern.compile("[a-zA-Z0-9]+");
        Matcher matcher = wordPattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
