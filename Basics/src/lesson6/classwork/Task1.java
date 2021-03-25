package lesson6.classwork;

public class Task1 {
    public static double getResult(double x, double y) {
        return 3 * x + 4 * y;
    }

    public static double getAverage(int start, int end) {
        int sum = 0;
        int count = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
            count++;
        }

        return (double) sum / count;
    }

    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int getMin(int a, int b) {
        return Math.min(b, a);
    }

    public static void main(String[] args) {
        double number = getResult(7, 8);
        System.out.println(number);

        double average = getAverage(1, 100);
        System.out.println(average);

        int max = getMax(1, 100);
        System.out.println(max);

        int min = getMin(25, 149);
        System.out.println(min);
    }
}