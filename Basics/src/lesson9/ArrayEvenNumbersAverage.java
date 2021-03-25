package lesson9;

public class ArrayEvenNumbersAverage {
    public static double getEvenNumbersAverage(int[] array) {
        int sum = 0;
        int count = 0;

        for (int e : array) {
            if (e % 2 == 0) {
                sum += e;
                count++;
            }
        }

        return (double) sum / count;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        double evenNumbersAverage = getEvenNumbersAverage(array);

        System.out.println("Среднее арифметическое четных чисел: " + evenNumbersAverage);
    }
}