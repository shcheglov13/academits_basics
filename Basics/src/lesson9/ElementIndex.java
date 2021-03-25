package lesson9;

public class ElementIndex {
    public static int getIndex(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] arg) {
        int[] array = {10, 4, 99, 34, 21, 3};

        int elementIndex = getIndex(array, 21);

        if (elementIndex != -1) {
            System.out.println("Индекс числа: " + elementIndex);
        } else {
            System.out.println("Число не найдено");
        }
    }
}