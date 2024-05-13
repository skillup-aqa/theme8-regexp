package ua.skillup.part1;

public class Main {
    public static void main(String[] args){
        System.out.println("Checking if number is binary 0001101 - " + StringValidator.isValidBinaryNumber("0001101"));
        System.out.println("Checking hex number 0x9510A01f00a - " + StringValidator.isValidHexNumber("0x9510A01f00a"));
        System.out.println(("Checking Ukrainian Phone Number +38(097) 353 83 33 - ") + StringValidator.isValidUkrainianPhoneNumber("+38(097) 353 83 33"));
        System.out.println(("Checking if IPv4 is valid 192.0.2.146 - ") + StringValidator.isValidIPv4("192.0.2.146"));

        System.out.println(("Checking if string is a valid password 5Tt$562! - ") + StringValidator.isValidPassword("5Tt$562!"));
        System.out.println(("Checking if string is a valid password 5Tt56225 - ") + StringValidator.isValidPassword("5Tt56225"));

        System.out.println(("Checking if string is a valid HTML-element https://www.w3schools.com/ - ") + StringValidator.isValidHTMLLink("https://www.w3schools.com/"));
    }
}
