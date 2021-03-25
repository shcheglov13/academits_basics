package courseWorks;

import java.util.Scanner;

public class BinarySearch {
    public static int getIndexByBinarySearchWithRecursion(int[] array, int startIndex, int endIndex, int number) {
        if (startIndex > endIndex) {
            return -1;
        }

        int middle = (startIndex + endIndex) / 2;

        if (array[middle] == number) {
            return middle;
        }

        if (number > array[middle]) {
            return getIndexByBinarySearchWithRecursion(array, middle + 1, endIndex, number);
        }

        return getIndexByBinarySearchWithRecursion(array, startIndex, middle - 1, number);
    }

    public static int getIndexByBinarySearch(int[] array, int number) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex <= endIndex) {
            int middle = (endIndex + startIndex) / 2;

            if (number == array[middle]) {
                return middle;
            }

            if (number > array[middle]) {
                startIndex = middle + 1;
            } else {
                endIndex = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 2, 5, 7, 10, 12};

        System.out.print("Введите число, которое требуется найти в массиве: ");
        int number = scanner.nextInt();

        System.out.println("Введите код метода, с помощью которого необходимо найти число в массиве (1-2): ");
        System.out.println("\t1. Бинарый поиск");
        System.out.println("\t2. Рекурсивный бинарный поиск");
        int commandCode = scanner.nextInt();

        int numberIndex = 0;

        switch (commandCode) {
            case 1:
                numberIndex = getIndexByBinarySearch(array, number);
                break;
            case 2:
                numberIndex = getIndexByBinarySearchWithRecursion(array, 0, array.length - 1, number);
                break;
            default:
                System.out.println("Неизвестный код метода");
        }

        if (numberIndex == -1) {
            System.out.println("Данное число отсутствует в массиве");
        } else {
            System.out.println("Индекс искомого числа: " + numberIndex);
        }
    }
}