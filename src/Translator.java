import java.util.HashMap;
import java.util.Map;

public class Translator {
    Map<Integer, String> numericAlpha = new HashMap<>();

    public Translator(String[] alphabetic, Integer[] numeric) {
        int i;
        for (i = 0; i <= alphabetic.length; i++) ;
        numericAlpha.put(numeric[i], alphabetic[i]);
    }

    private String translate(Integer[] number) {
        System.out.println("random tekst");

        return null;
    }
}





