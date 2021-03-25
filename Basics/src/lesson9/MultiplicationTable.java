package lesson9;

import java.util.Scanner;

public class MultiplicationTable {
    public static int[][] getMultiplicationTable(int rowsCount, int columnsCount) {
        int[][] multiplicationTable = new int[rowsCount][columnsCount];

        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        return multiplicationTable;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк в таблице умножения: ");
        int rowsCount = scanner.nextInt();

        System.out.println("Введите количество столбцов в таблице умножения: ");
        int columnsCount = scanner.nextInt();

        int[][] multiplicationTable = getMultiplicationTable(rowsCount, columnsCount);

        for (int[] row : multiplicationTable) {
            for (int number : row) {
                System.out.printf("%6d", number);
            }

            System.out.println();
        }
    }
}