package courseWorks;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static int getGreatestCommonDivisor(int number1, int number2) {
        while (number2 != 0) {
            int greatestCommonDivisor = number1 % number2;
            number1 = number2;
            number2 = greatestCommonDivisor;
        }

        return number1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        if (number1 == 0 && number2 == 0) {
            System.out.println("Поиск НОД невозможен, так как оба числа равны 0");
        } else {
            System.out.println("Наибольший общий делитель: " + getGreatestCommonDivisor(number1, number2));
        }
    }
}