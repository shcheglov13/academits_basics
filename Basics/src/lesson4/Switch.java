package lesson4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first number:");
        double number1 = scanner.nextDouble();

        System.out.println("Enter a second number:");
        double number2 = scanner.nextDouble();

        System.out.println("Enter the command code (from 1 to 4):");
        int commandCode = scanner.nextInt();

        switch (commandCode) {
            case 1:
                double sum = number1 + number2;
                System.out.println("The result of a sum: " + sum);
                break;
            case 2:
                double subtraction = number1 - number2;
                System.out.println("The result of a subtraction: " + subtraction);
                break;
            case 3:
                double multiplication = number1 * number2;
                System.out.println("The result of a multiplication: " + multiplication);
                break;
            case 4:
                double division = number1 / number2;
                System.out.println("The result of a division: " + division);
                break;
            default:
                System.out.println("Unknown command code");
        }
    }
}