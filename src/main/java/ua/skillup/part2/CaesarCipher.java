package ua.skillup.part2;

public class CaesarCipher {

    public static String encrypt(String text, int shift) {
        char[] symbols = text.toCharArray();
        char[] result = new char[symbols.length];

        for (int i = 0; i < symbols.length; i++) {
            char c = symbols[i];
            if (Character.isAlphabetic(c)) {
                char start = Character.isLowerCase(c) ? 'a' : 'A';
                result[i] = (char) (start + (c - start + shift) % 26);
            } else {
                result[i] = c;
            }
        }
        return new String(result);
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }
}
