package ua.skillup.part1;

public class StringValidator {
    public static boolean isValidBinaryNumber(String str) {

        return str.matches("^[0-1]+$");
    }

    public static boolean isValidHexNumber(String str) {

        return str.matches("^0[xX]?[0-9a-fA-F]+$");
    }

    public static boolean isValidUkrainianPhoneNumber(String str) {

        return str.replace(" ", "").matches("\\+?38\\(0\\d{2}\\)\\d{7}|\\(0\\d{2}\\)\\d{7}|\\+?380\\d{2}\\d{7}|0\\d{2}\\d{7}");
        //actual regular expression is \+?38\(0\d{2}\)\d{7}|\(0\d{2}\)\d{7}|\+?380\d{2}\d{7}|0\d{2}\d{7}
    }

    public static boolean isValidIPv4(String str) {

        return false;
    }

    public static boolean isValidPassword(String str) {
        return false;
    }

    public static boolean isValidHTMLLink(String str) {
        return false;
    }
}
