package studios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharactersInStringBONUS {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        ArrayList<String> alphaCharacters = new ArrayList<>();
        alphaCharacters.add("A");
        alphaCharacters.add("B");
        alphaCharacters.add("C");
        alphaCharacters.add("D");
        alphaCharacters.add("E");
        alphaCharacters.add("F");
        alphaCharacters.add("G");
        alphaCharacters.add("H");
        alphaCharacters.add("I");
        alphaCharacters.add("J");
        alphaCharacters.add("K");
        alphaCharacters.add("L");
        alphaCharacters.add("M");
        alphaCharacters.add("N");
        alphaCharacters.add("O");
        alphaCharacters.add("P");
        alphaCharacters.add("Q");
        alphaCharacters.add("R");
        alphaCharacters.add("S");
        alphaCharacters.add("T");
        alphaCharacters.add("U");
        alphaCharacters.add("V");
        alphaCharacters.add("X");
        alphaCharacters.add("Y");
        alphaCharacters.add("Z");

        System.out.println("enter your string - ");
        String inputString = input.nextLine().toUpperCase();
        input.close();

        HashMap<String, Integer> characterCounts = new HashMap<>();
        String[] hiddenFiguresArray = inputString.split("");


//        for (int i = 0 ; i < hiddenFiguresArray.length ; i++) {
//            if (alphaCharacters.contains(hiddenFiguresArray[i].toUpperCase())) {
//                if (characterCounts.containsKey(hiddenFiguresArray[i]) ) {
//                    characterCounts.put(hiddenFiguresArray[i], characterCounts.get(hiddenFiguresArray[i]) + 1);
//                }
//                else {
//                    characterCounts.put(hiddenFiguresArray[i], 1);
//                }
//            }
//        }

        for (String character : hiddenFiguresArray) {
            if (characterCounts.containsKey(character)){
                characterCounts.put(character, characterCounts.get(character) + 1);
            }
            else {
                characterCounts.put(character, 1);
            }
        }

        for (Map.Entry<String, Integer> characterCount : characterCounts.entrySet()) {
            System.out.println(characterCount.getKey() + " - " + characterCount.getValue());
        }
    }
}
