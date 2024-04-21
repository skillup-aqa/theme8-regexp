package ua.skillup.part2;

public class CaesarCipher {

    public static String encrypt(String text, int shift) {
        char[] chars = text.toCharArray();
        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (Character.isAlphabetic(chars[i])) {
                char start = Character.isLowerCase(chars[i]) ? 'a' : 'A';
                result[i] = (char) (start + (chars[i] - start + shift) % 26);
            } else {
                result[i] = chars[i];
            }
        }

        return new String(result);
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }
}
