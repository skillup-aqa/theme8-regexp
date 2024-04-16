package ua.skillup.part2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CaesarCipherTests {
    final String LINE_WITH_ALL_LETTERS = "farmer jack realized that big yellow quilts were expensive";
    final int SHIFT = 3;
    final String ENCRYPTED_BY_3 = "iduphu mdfn uhdolchg wkdw elj bhoorz txlowv zhuh hashqvlyh";

    @Test
    public void testEncrypt() {
        assertEquals(CaesarCipher.encrypt(LINE_WITH_ALL_LETTERS, SHIFT), ENCRYPTED_BY_3);
    }

    @Test
    public void testDecrypt() {
        assertEquals(CaesarCipher.decrypt(ENCRYPTED_BY_3, 3),
                     LINE_WITH_ALL_LETTERS);
    }

    @Test
    public void testEncryptAndDecrypt() {
        String encrypted = CaesarCipher.encrypt(LINE_WITH_ALL_LETTERS, SHIFT);
        assertEquals(CaesarCipher.decrypt(encrypted, SHIFT), LINE_WITH_ALL_LETTERS);
    }

    @Test
    public void testDecryptAndEncrypt() {
        String decrypted = CaesarCipher.decrypt(ENCRYPTED_BY_3, SHIFT);
        assertEquals(CaesarCipher.encrypt(decrypted, SHIFT), ENCRYPTED_BY_3);
    }

    @Test
    public void testEncryptWithShift0() {
        assertEquals(CaesarCipher.encrypt(LINE_WITH_ALL_LETTERS, 0), LINE_WITH_ALL_LETTERS);
    }

    @Test
    public void testEncryptWithShift26() {
        assertEquals(CaesarCipher.encrypt(LINE_WITH_ALL_LETTERS, 26), LINE_WITH_ALL_LETTERS);
    }

    @Test
    public void testEncryptEmptyString() {
        assertEquals(CaesarCipher.encrypt("", SHIFT), "");
    }
}
