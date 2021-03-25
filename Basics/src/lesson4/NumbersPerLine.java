package lesson4;

public class NumbersPerLine {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 100) {
            if (i < 10) {
                System.out.print(" ");
            }

            System.out.print(i + " ");

            if (i % 10 == 0) {
                System.out.println();
            }

            i++;
        }

        int rangeStart = 1;
        int rangeEnd = 100;
        int numbersPerLineCount = 10;
        int iterationsCount = 1;
        int j = rangeStart;

        while (j <= rangeEnd) {
            System.out.printf("%6d", j);

            if (iterationsCount % numbersPerLineCount == 0) {
                System.out.println();
            }

            iterationsCount++;
            j++;
        }
    }
}