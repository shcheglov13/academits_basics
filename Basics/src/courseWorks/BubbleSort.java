package courseWorks;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            boolean isSorted = true;

            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    isSorted = false;

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            if (isSorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {14, 3, 8, 9, 10, 54, 2, 1, 3, 7};

        sort(array);

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}