package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String vowels = "aeiouyAEIOUY";
        String consonant = "qwrtpsdfghjklzxcvbnmQWRTPSDFGHJKLZXCVBNM";
        if (vowels.contains (character)) {
            System.out.println("Vowel");
        } else if (consonant.contains(character)) {
            System.out.println("Consonant");
        } else  {
            System.out.println("wrong alphabet!");
        }
    }
}
