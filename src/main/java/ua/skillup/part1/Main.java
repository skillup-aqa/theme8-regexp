package ua.skillup.part1;

public class Main {
    public static void main(String[] args){
        System.out.println("Checking if number is binary 0001101 - " + StringValidator.isValidBinaryNumber("0001101"));
        System.out.println("Checking hex number 0x9510A01f00a - " + StringValidator.isValidHexNumber("0x9510A01f00a"));
        System.out.println(("Checking Ukrainian Phone Number +38(097) 353 83 33 - ") + StringValidator.isValidUkrainianPhoneNumber("+38(097) 353 83 33"));
        System.out.println(("Checking if IPv4 is valid 169.254.0.0/16 - ") + StringValidator.isValidIPv4("169.254.0.0/16"));
    }
}
