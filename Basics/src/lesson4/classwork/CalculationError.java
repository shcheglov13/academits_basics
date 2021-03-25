package lesson4.classwork;

import java.util.Scanner;

public class CalculationError {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double number1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double number2 = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if (Math.abs(number1 - number2) <= epsilon) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println("The numbers are not equal");
        }
    }
}