package ua.skillup.part2;

public class ToPrintPart2 {
    public static void main(String[] args) {
        System.out.println("Acronym marker to Internal Revenue Service - " + AcronymMaker.makeAcronym("Internal Revenue Service"));

        System.out.println("Counting numbers of words in a sentence - I have a lot to do tomorrow - cleaning, cooking, studying and homework! - " + WordCounter.countWords("I have a lot to do tomorrow - cleaning, cooking, studying and homework!"));

        System.out.println("Ceasar Chiher for - Miami Beach - " + CaesarCipher.encrypt("Miami Beach", 3));
        System.out.println("Ceasar Chiher for - Pldpl Ehdfk - " + CaesarCipher.decrypt("Pldpl Ehdfk", 3));

    }
}
