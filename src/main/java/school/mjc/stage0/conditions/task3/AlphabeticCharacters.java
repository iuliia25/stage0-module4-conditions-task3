package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String vowels = "aeiouyAEIOUY";
        String consonant = "qwrtpsdfghjklzxcvbnmQWRTPSDFGHJKLZXCVBNM";
        Character a = new Character(character);
        if (vowels.contains (a)) {
            System.out.println("Vowel");
        } else if (consonant.contains(a)) {
            System.out.println("Consonant");
        } else  {
            System.out.println("wrong alphabet!");
        }
    }
}
