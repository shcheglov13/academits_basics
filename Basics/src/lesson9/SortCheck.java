package lesson9;

public class SortCheck {
    public static boolean isAscendingSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isDescendingSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array = {10, 8, 7, 3, 2, 2, 1};

        boolean isAscendingSort = isAscendingSort(array);
        boolean isDescendingSort = isDescendingSort(array);

        if (isAscendingSort) {
            System.out.println("Массив отсортирован по возрастанию");
        } else if (isDescendingSort) {
            System.out.println("Массив отсортирован по убыванию");
        } else {
            System.out.println("Массив не отсортирован");
        }
    }
}