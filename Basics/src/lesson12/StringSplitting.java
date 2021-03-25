package lesson12;

public class StringSplitting {
    public static int getSumFromString(String numbersString) {
        String[] numbersStringsArray = numbersString.split(", ");
        int[] numbersArray = new int[numbersStringsArray.length];

        int sum = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = Integer.parseInt(numbersStringsArray[i]);
            sum += numbersArray[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        String numbersString = "1, 2, 3, 4, 5";

        int sum = getSumFromString(numbersString);
        System.out.print("Сумма чисел строки: " + sum);
    }
}