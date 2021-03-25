package courseWorks;

import java.util.Scanner;

public class NextDate {
    public static String getNextDate(int day, int month, int year) {
        int maxDay = 0;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            maxDay = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDay = 30;
        } else if (month == 2) {
            maxDay = 28;

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                maxDay = 29;
            }
        }

        if (month < 1 || month > 12 || day > maxDay || year < 0) {
            return "Неверная дата";
        }

        if (day == maxDay && month == 12) {
            day = 1;
            month = 1;
            year++;

            return "Дата следующего дня: " + day + "." + month + "." + year;
        }

        if (day == maxDay) {
            day = 1;
            month++;

            return "Дата следующего дня: " + day + "." + month + "." + year;
        }

        day++;

        return "Дата следующего дня: " + day + "." + month + "." + year;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день: ");
        int day = scanner.nextInt();

        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();

        System.out.println("Введите год: ");
        int year = scanner.nextInt();

        String nextDate = getNextDate(day, month, year);
        System.out.println(nextDate);
    }
}