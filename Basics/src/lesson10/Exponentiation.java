package lesson10;

import java.util.Scanner;

public class Exponentiation {
    public static int raiseToPower(int number, int power) {
        int result = 1;

        for (int i = 0; i < power; i++) {
            result *= number;
        }

        return result;
    }

    public static int raiseToPowerWithRecursion(int number, int power) {
        if (power == 0) {
            return 1;
        }

        return raiseToPowerWithRecursion(number, power - 1) * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.print("Введите степень: ");
        int power = scanner.nextInt();

        System.out.println("Введите код метода, с помощью которого необходимо возвести число в степень (1-2): ");
        System.out.println("\t1. Нерекурсивный метод возведения в степень");
        System.out.println("\t2. Рекурсивный метод возведения в степень");
        int commandCode = scanner.nextInt();

        int result = 0;

        switch (commandCode) {
            case 1:
                result = raiseToPower(number, power);
                break;
            case 2:
                result = raiseToPowerWithRecursion(number, power);
                break;
            default:
                System.out.println("Неверный код метода");
        }

        System.out.println("Результат возведения числа в степень: " + result);
    }
}