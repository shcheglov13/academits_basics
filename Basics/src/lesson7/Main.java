package lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задайте начало числового диапазона:");
        double from = scanner.nextDouble();

        System.out.println("Задайте конец числового диапазона:");
        double to = scanner.nextDouble();

        Range range = new Range(from, to);

        for (; ; ) {
            System.out.println("Список команд:");
            System.out.println("\t1. Узнать длину числового диапазона");
            System.out.println("\t2. Узнать принадлежность любого числа к диапазону");
            System.out.println("\t3. Узнать границы числового диапазона");
            System.out.println("\t4. Изменить границы числового диапазона");
            System.out.println("\t5. Завершить программу");

            System.out.println("Выберете команду:");
            int selectedCommand = scanner.nextInt();

            boolean isEnd = false;

            switch (selectedCommand) {
                case 1:
                    double length = range.getLength();
                    System.out.println("Длина числового диапазона составляет: " + length);
                    break;
                case 2:
                    System.out.println("Введите число:");
                    double number = scanner.nextDouble();

                    boolean isInside = range.isInside(number);

                    if (isInside) {
                        System.out.println("Число принадлежит диапазону");
                    } else {
                        System.out.println("Число не принадлежит диапазону");
                    }

                    break;
                case 3:
                    double currentFrom = range.getFrom();
                    double currentTo = range.getTo();

                    System.out.println("Начало числового диапазона: " + currentFrom);
                    System.out.println("Конец числового диапазона: " + currentTo);
                    break;
                case 4:
                    System.out.println("Измените начало числового диапазона:");
                    double modifiedFrom = scanner.nextDouble();

                    System.out.println("Измените конец числового диапазона:");
                    double modifiedTo = scanner.nextDouble();

                    range.setFrom(modifiedFrom);
                    range.setTo(modifiedTo);

                    System.out.println("Границы диапазона изменены");
                    break;
                case 5:
                    isEnd = true;
                    break;
                default:
                    System.out.println("Неизвестная команда");
            }

            if (isEnd) {
                break;
            }

            System.out.println();
        }
    }
}