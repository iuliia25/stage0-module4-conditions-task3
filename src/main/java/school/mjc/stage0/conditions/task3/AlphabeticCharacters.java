package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String vowels = "aeiouyAEIOUY";
        String consonant = "qwrtpsdfghjklzxcvbnmQWRTPSDFGHJKLZXCVBNM";
        String s = new String(character);
        if (vowels.contains (s)) {
            System.out.println("Vowel");
        } else if (consonant.contains(s)) {
            System.out.println("Consonant");
        } else  {
            System.out.println("wrong alphabet!");
        }
    }
}
