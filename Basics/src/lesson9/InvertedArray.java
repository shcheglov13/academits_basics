package lesson9;

import java.util.Arrays;

public class InvertedArray {
    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        invertArray(array);

        System.out.println("Массив с элементами в обратном порядке: " + Arrays.toString(array));
    }
}