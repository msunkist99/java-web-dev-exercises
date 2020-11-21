package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of your circle");
        double radius = input.nextDouble();

        System.out.println("Area of your circle is - " + (3.14 * (radius*radius)));

        System.out.println("Area of your circle is - " + Circle.getArea(radius));
    }
}
