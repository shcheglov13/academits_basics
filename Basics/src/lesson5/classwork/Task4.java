package lesson5.classwork;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i == 5) {
                continue;
            } else if (i % 3 == 0) {
                continue;
            } else if (i >= 60 && i <= 80) {
                continue;
            }

            System.out.println(i);
        }

        for (int j = 0; j <= 100; j++) {
            if (j == 5 || j % 3 == 0 || (j >= 60 && j <= 80)) {
                continue;
            }

            System.out.println(j);
        }

        int k = 0;

        while (k <= 100) {
            if (k == 5 || k % 3 == 0 || (k >= 60 && k <= 80)) {
                k++;
                continue;
            }

            System.out.println(k);
            k++;
        }
    }
}