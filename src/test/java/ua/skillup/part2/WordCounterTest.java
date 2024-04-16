package ua.skillup.part2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WordCounterTest {
    @Test
    public void testCountWords() {
        String text = "The quick brown fox jumps over the lazy dog";
        int expectedWordsCount = 9;
        assertEquals(WordCounter.countWords(text), expectedWordsCount);
    }

    @Test
    public void testCountWordsWithEmptyString() {
        String text = "";
        int expectedWordsCount = 0;
        assertEquals(WordCounter.countWords(text), expectedWordsCount);
    }
}
