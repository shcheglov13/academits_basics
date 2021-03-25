package courseWorks;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            array[minIndex] = array[i];
            array[i] = min;
        }
    }

    public static void main(String[] args) {
        int[] array = {14, 3, 8, 9, 10, 54, 2, 1, 3, 7};

        sort(array);

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}