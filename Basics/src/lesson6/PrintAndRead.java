package lesson6;

import java.util.Scanner;

public class PrintAndRead {
    public static int getNumber(String string) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(string);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int number1 = getNumber("Введите число #1:");
        int number2 = getNumber("Введите число #2:");
        int number3 = getNumber("Введите число #3:");

        System.out.println("Вы ввели: " + number1);
        System.out.println("Вы ввели: " + number2);
        System.out.println("Вы ввели: " + number3);
    }
}