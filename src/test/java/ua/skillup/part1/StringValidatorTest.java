package ua.skillup.part1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class StringValidatorTest {
    @Test
    public void testValidBinaryNumber() {
        assertTrue(StringValidator.isValidBinaryNumber("1010101010"));
    }

    @Test
    public void testInvalidBinaryNumber() {
        assertFalse(StringValidator.isValidBinaryNumber("10101010102"));
    }

    @Test
    public void testEmptyStringIsInvalidBinaryNumber() {
        assertFalse(StringValidator.isValidBinaryNumber(""));
    }

    @DataProvider(name = "validHexNumbers")
    public Object[][] validHexNumbers() {
        return new Object[][]{
                {"0x0"},
                {"0xA"},
                {"0x123456789ABCDEF"},
                {"0x123456789abcdef"},
                {"0x123456789abcdef0123"},
        };
    }

    @Test(dataProvider = "validHexNumbers")
    public void testValidHexNumber(String hexNumber) {
        assertTrue(StringValidator.isValidHexNumber(hexNumber));
    }

    @DataProvider(name = "invalidHexNumbers")
    public Object[][] invalidHexNumbers() {
        return new Object[][]{
                {"0x"},
                {"123456789ABCDEF"},
                {"123456789ABCDEF0x"},
                {"x23132"},
                {"0х123"},
        };
    }

    @Test(dataProvider = "invalidHexNumbers")
    public void testInvalidHexNumber(String hexNumber) {
        assertFalse(StringValidator.isValidHexNumber(hexNumber));
    }

    @DataProvider(name = "validUkrainianPhoneNumbers")
    public Object[][] validUkrainianPhoneNumbers() {
        return new Object[][]{
                {"+380501234567"},
                {"380671234567"},
                {"0631234567"},
                {"+38(068)1234567"},
                {"+38(091)123 45 67"},
                {"+38092 12 34 567"},
        };
    }

    @Test(dataProvider = "validUkrainianPhoneNumbers")
    public void testValidUkrainianPhoneNumber(String phoneNumber) {
        assertTrue(StringValidator.isValidUkrainianPhoneNumber(phoneNumber));
    }

    @DataProvider(name = "invalidUkrainianPhoneNumbers")
    public Object[][] invalidUkrainianPhoneNumbers() {
        return new Object[][]{
                {"+3805012345678"},
                {"38067123456"},
                {"63123456789"},
                {"8(068)1234567"},
                {"+38(091123 45 67"},
        };
    }

    @Test(dataProvider = "invalidUkrainianPhoneNumbers")
    public void testInvalidUkrainianPhoneNumber(String phoneNumber) {
        assertFalse(StringValidator.isValidUkrainianPhoneNumber(phoneNumber));
    }

    @DataProvider(name = "validIPv4Addresses")
    public Object[][] validIPv4Addresses() {
        return new Object[][]{
                {"0.0.0.0"},
                {"255.255.255.255"},
                {"199.199.199.199"},
                {"1.1.1.1"},
                {"10.10.10.10"},
        };
    }

    @Test(dataProvider = "validIPv4Addresses")
    public void testValidIPv4(String ip) {
        assertTrue(StringValidator.isValidIPv4(ip));
    }

    @DataProvider(name = "invalidIPv4Addresses")
    public Object[][] invalidIPv4Addresses() {
        return new Object[][]{
                {"a.b.c.d"},
                {"256.256.256.256"},
                {"300.300.300.300"},
                {"-1.-1.-1.-1"},
                {"x.x.x.x"},
                {"1.1..1.1"},
                {""},
        };
    }

    @Test(dataProvider = "invalidIPv4Addresses")
    public void testInvalidIPv4(String ip) {
        assertFalse(StringValidator.isValidIPv4(ip));
    }

    @DataProvider(name = "validLinks")
    public Object[][] validLinks() {
        return new Object[][]{
                {"<a href=\"http://www.google.com\">Google</a>"},
                {"<a href=\"#\">Anchor</a>"},
                {"<a href=\"/\">Google</a>"},
                {"<a href=\"http://www.google.com.ua\"></a>"},
        };
    }

    @Test(dataProvider = "validLinks")
    public void testValidHTMLLink(String link) {
        assertTrue(StringValidator.isValidHTMLLink(link));
    }

    @DataProvider(name = "invalidLinks")
    public Object[][] invalidLinks() {
        return new Object[][]{
                {"<a href=\"http://www.google.com\">Google</a"},
                {"<a href >Empty href</a>"},
                {"<a>No href</a>"},
                {"<a href=\"/\">No closing a tag"},
                {"a href=\"http://www.google.com.ua\">Not a tag<a>"},
                {"qrqwr<a href=\"http://www.google.com\">Extra symbols</a>"},
        };
    }
}

