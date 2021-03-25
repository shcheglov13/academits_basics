package lesson4;

public class RowSum {
    public static void main(String[] args) {
        int i = 1;
        int numbersCount = 6;
        int result = 0;

        while (i <= numbersCount) {
            if (i % 2 == 0) {
                result -= Math.pow(i, 2);
            } else {
                result += Math.pow(i, 2);
            }

            i++;
        }

        System.out.println("Result is: " + result);
    }
}