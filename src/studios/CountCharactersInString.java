package studios;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;

public class CountCharactersInString {
    public static void main (String[] args) {

        String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<String, Integer> characterCounts = new HashMap<>();
        String[] hiddenFiguresArray = hiddenFigures.split("");

        for (int i = 0 ; i < hiddenFiguresArray.length ; i++) {
            if (characterCounts.containsKey(hiddenFiguresArray[i]) ) {
                characterCounts.put(hiddenFiguresArray[i], characterCounts.get(hiddenFiguresArray[i]) + 1);
            }
            else {
                characterCounts.put(hiddenFiguresArray[i], 1);
            }
        }

        for (Map.Entry<String, Integer> characterCount : characterCounts.entrySet()) {
            System.out.println(characterCount.getKey() + " - " + characterCount.getValue());
        }
    }
}
