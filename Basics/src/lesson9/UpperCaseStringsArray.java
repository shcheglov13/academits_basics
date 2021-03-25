package lesson9;

import java.util.Arrays;

public class UpperCaseStringsArray {
    public static void convertToUpperCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
    }

    public static void main(String[] args) {
        String[] array = {"random", "words", "our", "earth"};

        convertToUpperCase(array);

        System.out.println("Массив строк в верхнем регистре: " + Arrays.toString(array));
    }
}