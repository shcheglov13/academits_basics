package lesson9.classwork;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int e : array) {
            System.out.println(e);
        }
    }
}