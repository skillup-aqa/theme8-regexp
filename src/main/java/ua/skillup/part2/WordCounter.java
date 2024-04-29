package ua.skillup.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {
    public static int countWords(String text) {
        Pattern countWordsPattern = Pattern.compile("[0-9A-Za-z]+");
        Matcher matcher = countWordsPattern.matcher(text);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }
}
