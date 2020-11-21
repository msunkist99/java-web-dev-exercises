package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main (String[] args) {
        String drSeus = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse. ";

        ArrayList<Integer> integers = new ArrayList<> (0);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);

        System.out.println("sum of even numbers - " + sumIntegers(integers));

        ArrayList<String > words = new ArrayList<>();
        words.add("pizza");
        words.add("salad");
        words.add("meatloaf");

        printFiveCharacterWords(words);
        printUserSpecifiedCharacterWords(words);

        String drSeusArray[] = drSeus.split(" ");
        ArrayList<String> drSeusArrayList = new ArrayList<>();

        for (int i = 0 ; i < drSeusArray.length ; i++){
            drSeusArrayList.add(drSeusArray[i]);
        }
        System.out.println(drSeusArrayList);
    }

    public static int sumIntegers (ArrayList<Integer> integers) {
        int sum = 0;

        for(int i = 0 ; i < integers.size() ; i++){
            if (integers.get(i) % 2 == 0) {
                sum += integers.get(i);
            }
        }
        return sum;
    }

    public static void printFiveCharacterWords (ArrayList<String> words) {
        for (int i = 0 ; i < words.size() ; i++){
            if (words.get(i).length() == 5) {
                System.out.println(words.get(i));
            }
        }
    }

    public static void printUserSpecifiedCharacterWords (ArrayList<String> words) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of characters");

        int numberOfCharacters = input.nextInt();

        for (int i = 0 ; i < words.size() ; i++){
            if (words.get(i).length() == numberOfCharacters) {
                System.out.println(words.get(i));
            }
        }
    }
}
