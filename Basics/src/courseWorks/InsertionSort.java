package courseWorks;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int j = i - 1;

            for (; j >= 0; j--) {
                if (currentElement < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }

            array[j + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] array = {14, 3, 8, 9, 10, 54, 2, 1, 3, 7};

        sort(array);

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}