package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        System.out.println("\nFlavor Names Before:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        //Comparator comparator = new FlavorComparator();
        //flavors.sort(comparator);
        flavors.sort(new FlavorComparator());

        System.out.println("\nFlavor Names After:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        System.out.println("\nCone Cost Before:");
        for (Cone cone : cones) {
            System.out.println(cone.getCost());
        }

        cones.sort(new ConeComparator());

        System.out.println("\nCone Cost After:");
        for (Cone cone : cones) {
            System.out.println(cone.getCost());
        }
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        System.out.println("\nFlavor Allergen Count Before:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getAllergens().size());
        }

        flavors.sort(new FlavorAllergenCountComparator());

        System.out.println("\nFlavor Allergen Count After:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getAllergens().size());
        }


        System.out.println("\nTopping Name Count Before:");
        for (Topping topping : toppings) {
            System.out.println(topping.getName());
        }

        toppings.sort(new ToppingComparator());

        System.out.println("\nTopping Name Count After:");
        for (Topping topping : toppings) {
            System.out.println(topping.getName());
        }
    }
}
