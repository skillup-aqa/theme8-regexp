package ua.skillup.part2;

public class CaesarCipher {

    public static String encrypt(String text, int shift) {
        char [] chars = text.toCharArray();
        char [] result = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isAlphabetic(c)){
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

    public static void main(String[] args) {
        System.out.println(encrypt("farmer jack realized that big yellow quilts were expensive", 3));
    }
}
