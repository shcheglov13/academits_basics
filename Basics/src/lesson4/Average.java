package lesson4;

public class Average {
    public static void main(String[] args) {
        int rangeStart1 = 3;
        int rangeEnd1 = 24;
        int numbersCount = 0;
        int numbersSum = 0;
        int i = rangeStart1;

        while (i <= rangeEnd1) {
            numbersSum += i;
            numbersCount++;
            i++;
        }

        double numbersAverage = (double) numbersSum / numbersCount;
        System.out.println("Average of the numbers is: " + numbersAverage);

        int rangeStart2 = 3;
        int rangeEnd2 = 24;
        int evenNumbersCount = 0;
        int evenNumbersSum = 0;
        int j = rangeStart2;

        while (j <= rangeEnd2) {
            if (j % 2 == 0) {
                evenNumbersSum += j;
                evenNumbersCount++;
            }

            j++;
        }

        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;
        System.out.println("Average of the even numbers is: " + evenNumbersAverage);
    }
}