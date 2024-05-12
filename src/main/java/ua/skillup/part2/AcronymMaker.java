package ua.skillup.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AcronymMaker {
    public static String makeAcronym(String phrase) {
        StringBuilder resultBuilder = new StringBuilder();
        Pattern pattern = Pattern.compile("/?[A-Z]");
        Matcher matcher = pattern.matcher(phrase);
        while (matcher.find()) {
            resultBuilder.append(matcher.group());
        }
        return resultBuilder.toString();
    }
}
