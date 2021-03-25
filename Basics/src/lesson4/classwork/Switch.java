package lesson4.classwork;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the command");
        String command = scanner.nextLine();

        switch (command) {
            case "print":
                System.out.println("Enter the string");
                String userString = scanner.nextLine();

                System.out.println(userString);
                break;
            case "sum":
                System.out.println("Enter the first number");
                double number1 = scanner.nextDouble();

                System.out.println("Enter the first number");
                double number2 = scanner.nextDouble();

                double sum = number1 + number2;
                System.out.println("The sum of numbers is: " + sum);
                break;
            default:
                System.out.println("Unknown command");
        }
    }
}
