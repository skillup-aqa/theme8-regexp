package ua.skillup.part1;

public class CheckerForValidator {
    public static void main(String[] args) {
        System.out.println("Binary check 0100101: " + StringValidator.isValidBinaryNumber("0100101"));
        System.out.println("Hex check 0x00101343dfbBA: " + StringValidator.isValidHexNumber("0x00101343dfbBA"));

    }

}
