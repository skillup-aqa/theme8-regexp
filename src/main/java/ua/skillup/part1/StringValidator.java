package ua.skillup.part1;

public class StringValidator {
    public static boolean isValidBinaryNumber(String str) {
        return str.matches("^[01]+$");
    }

    public static boolean isValidHexNumber(String str) {
        return str.matches("^0x[0-9a-fA-F]+$");
    }

    public static boolean isValidUkrainianPhoneNumber(String str) {
        return str.replace(" ", "").matches("^\\+?(38\\(0\\d{2}\\)|380\\d{2}|0\\d{2})\\d{7}$");
    }

    public static boolean isValidIPv4(String str) {
        return str.matches("^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$");
    }

    public static boolean isValidPassword(String str) {
        return str.matches ("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[~!@#$%^&*()_+\\-=<>?`:;,./|])(?=.\\S+$).{8,}$");
    }

    public static boolean isValidHTMLLink(String str) {
        return str.matches("<a href=\"(http://www\\..+|https://www\\..+|www\\..+|http://.+|https://.+|ftp://.+|mailto:.+|#\\w*|/\\w*)\">.*</a>");
    }
}
