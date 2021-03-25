package lesson5.classwork;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 100; i >= 0; i--) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 1; i <= 6; i++) {
            double pow = Math.pow(i, 2);
            System.out.println(pow);
        }


        int sum = 0;
        int count = 0;

        for (int i = 3; i <= 24; i++) {
            sum += i;
            count++;
        }

        double average = (double) sum / count;
        System.out.println(average);
    }
}