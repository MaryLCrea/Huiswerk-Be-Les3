

import java.util.HashMap;
import java.util.Map;
//4. Class Translator
public class Translator {
    //5. Hashmap
    Map<Integer, String> numericAlpha = new HashMap<>();

    // 6. Constructor
    public Translator(String[] alphabetic, Integer[] numeric) {

        //7. For-Loop
        int i;
        for (i = 0; i <= alphabetic.length; i++) {
            //8. Entry hashmap
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }
   // 10. Method Translate
    private String translate(Integer[] number) {
        System.out.println("random tekst");

      //11.??
        return null;
    }
}





