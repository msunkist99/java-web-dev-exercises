package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of your circle");
        double radius = input.nextDouble();
        input.skip("\n");       // don't really need this skip
        input.close();

        System.out.println("Area of your circle is - " + (3.14 * (radius*radius)));

        // use the getArea method
        System.out.println("Area of your circle is - " + Circle.getArea(radius));
    }
}
