package ua.skillup.part2;

import ua.skillup.part1.StringValidator;
import ua.skillup.part2.logparser.LogEntry;
import ua.skillup.part2.logparser.LogLevel;
import ua.skillup.part2.logparser.LogParser;

import java.time.LocalDateTime;

public class CheckPart2Theme8 {
    public static void main(String[] args) {
        System.out.println("HyperText Transfer Protocol: " + AcronymMaker.makeAcronym("HyperText Transfer Protocol"));
        System.out.println("Light Amplification by Stimulated Emission of Radiation: " +
                AcronymMaker.makeAcronym("Light Amplification by Stimulated Emission of Radiation"));
        System.out.println("This is a sentence with seven words: " +WordCounter.countWords("This is a sentence with seven words."));

        System.out.println(Character.isAlphabetic('s'));
        System.out.println(Character.isLowerCase('L') ? 'a' : 'A');
        System.out.println((char) 97);

        System.out.println(CaesarCipher.encrypt("basTion 54 mu", 5));
        System.out.println(CaesarCipher.decrypt(CaesarCipher.encrypt("bastiON 54 mu", 5), 5));

    }
}
