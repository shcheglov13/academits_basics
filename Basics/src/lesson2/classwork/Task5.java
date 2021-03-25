package lesson2.classwork;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length: ");
        double rectangleLength = scanner.nextDouble();

        System.out.println("Enter the width: ");
        double rectangleWidth = scanner.nextDouble();

        double rectangleArea = rectangleLength * rectangleWidth;
        double rectanglePerimeter = rectangleLength + rectangleWidth;

        System.out.printf("Length = %f%nWidth = %f%nArea = %f%nPerimeter = %f%n", rectangleLength, rectangleWidth, rectangleArea, rectanglePerimeter);

        String s = String.format("Length = %f%nWidth = %f%nArea = %f%nPerimeter = %f", rectangleLength, rectangleWidth, rectangleArea, rectanglePerimeter);
        System.out.println(s);
    }
}