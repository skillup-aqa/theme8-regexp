package ua.skillup.part1;

public class StringValidator {
    public static boolean isValidBinaryNumber(String str) {

        return str.matches("^[0-1]+$");
    }

    public static boolean isValidHexNumber(String str) {

        return str.matches("^0[xX]?[0-9a-fA-F]+$");
    }

    public static boolean isValidUkrainianPhoneNumber(String str) {
        return false;
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
