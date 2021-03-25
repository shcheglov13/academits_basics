package lesson5;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        System.out.println("List of prime numbers:");

        for (int i = 2; i <= number; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                System.out.println(i);
            }
        }
    }
}