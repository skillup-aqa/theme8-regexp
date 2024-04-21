package ua.skillup.part1;

public class StringValidator {
    public static boolean isValidBinaryNumber(String str) {

        return str.matches("^[0-1]+$");
    }

    public static boolean isValidHexNumber(String str) {

        return str.matches("^0[xX]?[0-9a-fA-F]+$");
    }

    public static boolean isValidUkrainianPhoneNumber(String str) {
        //actual regular expression is \+?38\(0\d{2}\)\d{7}|\(0\d{2}\)\d{7}|\+?380\d{2}\d{7}|0\d{2}\d{7}
        return str.replace(" ", "").matches("\\+?38\\(0\\d{2}\\)\\d{7}|\\(0\\d{2}\\)\\d{7}|\\+?380\\d{2}\\d{7}|0\\d{2}\\d{7}");

    }

    public static boolean isValidIPv4(String str) {
        //actual regular expression is ^(25[05]\.|1[0-9]?[0-9]?\.|0[0-9]?[0-9]?\.){3}(25[05]|1[0-9]?[0-9]?|0[0-9]?[0-9]?)$
        return str.matches("^(25[05]\\.|1[0-9]?[0-9]?\\.|0[0-9]?[0-9]?\\.){3}(25[05]|1[0-9]?[0-9]?|0[0-9]?[0-9]?)$");
    }

    public static boolean isValidPassword(String str) {
        return false;
    }

    public static boolean isValidHTMLLink(String str) {
        //actual regular expression is <a\shref="(http:\/\/w*\..+">|#">|\/")+.*<\/a>
        return str.matches("<a\\shref=\"(http:\\/\\/w*\\..+\">|#\">|\\/\")+.*<\\/a>");
    }
}
