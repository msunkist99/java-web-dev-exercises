package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main (String[] args) {
        int[] integers = new int[]{1, 1, 2, 3, 5, 8};

        for (int i = 0 ; i < integers.length ; i++){
            System.out.println(integers[i]);
        }

        System.out.println("\nOdd numbers");
        for (int i = 0 ; i < integers.length ; i++) {
            if ((integers[i] % 2) != 0) {
                System.out.println(integers[i]);
            }
        }

        String drSeus = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] drSeusArray = drSeus.split(" ");
        System.out.println(Arrays.toString(drSeusArray));

        drSeusArray = drSeus.split("\\.");
        System.out.println(Arrays.toString(drSeusArray));
    }
}
