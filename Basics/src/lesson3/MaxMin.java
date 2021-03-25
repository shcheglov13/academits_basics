package lesson3;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter a second number:");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("Max: " + number1);
            System.out.println("Min: " + number2);
        } else {
            System.out.println("Max: " + number2);
            System.out.println("Min: " + number1);
        }

        int max = (number1 > number2) ? number1 : number2;
        int min = (number2 > number1) ? number1 : number2;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}