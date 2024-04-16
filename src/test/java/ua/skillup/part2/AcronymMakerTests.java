package ua.skillup.part2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AcronymMakerTests {
    @DataProvider(name = "acronymDataProvider")
    public Object[][] acronymDataProvider() {
        return new Object[][]{
                {"Portable Document Format", "PDF"},
                {"HyperText Transfer Protocol", "HTTP"},
                {"Light Amplification by Stimulated Emission of Radiation", "LASER"},
                {"Joint Photographic Experts Group", "JPEG"},
        };
    }

    @Test(dataProvider = "acronymDataProvider")
    public void testMakeAcronym(String phrase, String expectedAcronym) {
        assertEquals(AcronymMaker.makeAcronym(phrase), expectedAcronym);
    }
}
