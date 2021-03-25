package courseWorks;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = array[left + (right - left) / 2];
        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }

        if (left < j) {
            sort(array, left, j);
        }

        if (right > i) {
            sort(array, i, right);
        }
    }

    public static void main(String[] args) {
        int[] array = {14, 3, 8, 9, 10, 54, 2, 1, 3, 7};

        sort(array, 0, array.length - 1);

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}