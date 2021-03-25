package courseWorks;

import java.util.Scanner;

public class MultiplicationTable {
    public static void printMultiplicationTable(int rowsCount, int columnsCount) {
        System.out.printf("     %4d", 1);

        for (int i = 2; i <= columnsCount; i++) {
            System.out.printf("%4d", i);
        }

        System.out.println();
        System.out.print("   -|");

        for (int i = 1; i <= columnsCount; i++) {
            System.out.print("----");
        }

        System.out.println();

        for (int i = 1; i <= rowsCount; i++) {
            System.out.printf("%4d|", i);

            for (int j = 1; j <= columnsCount; j++) {
                System.out.printf("%4d", j * i);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк в таблице умножения: ");
        int rowsCount = scanner.nextInt();

        System.out.println("Введите количество столбцов в таблице умножения: ");
        int columnsCount = scanner.nextInt();

        printMultiplicationTable(rowsCount, columnsCount);
    }
}