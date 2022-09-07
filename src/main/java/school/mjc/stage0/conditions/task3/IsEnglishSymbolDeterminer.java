package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        String eng = "QWERTYUIOPASDFGHJKLZXCVBNMqwrtyuiopasdfghjklzxcvnbnm";
        Character a= Character.valueOf(symbol);
        if (eng.contains (a.toString())) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
