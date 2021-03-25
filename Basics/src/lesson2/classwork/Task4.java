package lesson2.classwork;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length: ");
        double rectangleLength = scanner.nextDouble();

        System.out.println("Enter the width: ");
        double rectangleWidth = scanner.nextDouble();

        double rectangleArea = rectangleLength * rectangleWidth;
        double rectanglePerimeter = rectangleLength + rectangleWidth;

        System.out.println("The area of a rectangle is: " + rectangleArea);
        System.out.println("The perimeter of a rectangle is: " + rectanglePerimeter);
    }
}