package courseWorks;

import java.util.Arrays;
import java.util.Random;

public class HeapSort {
    public static void sort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            sift(array, array.length, i);
        }

        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            sift(array, i, 0);
        }
    }

    public static void sift(int[] array, int length, int rootIndex) {
        int maxElementIndex = rootIndex;

        do {
            if (maxElementIndex != rootIndex) {
                rootIndex = maxElementIndex;
            }

            int leftChildIndex = 2 * rootIndex + 1;
            int rightChildIndex = 2 * rootIndex + 2;

            if (leftChildIndex < length && array[leftChildIndex] > array[maxElementIndex]) {
                maxElementIndex = leftChildIndex;
            }

            if (rightChildIndex < length && array[rightChildIndex] > array[maxElementIndex]) {
                maxElementIndex = rightChildIndex;
            }

            if (maxElementIndex != rootIndex) {
                int temp = array[rootIndex];
                array[rootIndex] = array[maxElementIndex];
                array[maxElementIndex] = temp;
            }
        } while (maxElementIndex != rootIndex);
    }

    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[1000];

        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(9999);
            array[i] = randomNumber;
        }

        sort(array);

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}