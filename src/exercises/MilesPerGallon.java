package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven - ");
        double milesDriven = input.nextDouble();
        input.skip("\n");

        System.out.println("How many gallons of gas consumed - ");
        double gallonsGasConsumed = input.nextDouble();
        input.skip("\n");

        input.close();

        System.out.println("your miles per gallon - " + (milesDriven/gallonsGasConsumed));
    }

}
