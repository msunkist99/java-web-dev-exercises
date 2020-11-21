package exercises;

import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangle width - ");
        int width = input.nextInt();
        System.out.println("Rectangle length - ");
        int length = input.nextInt();

        System.out.println("Area of the rectangle is - " + (width*length));
    }
}
