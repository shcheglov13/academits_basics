package lesson4;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        int i = 1;
        int digitsAmount = (int) Math.log10(number) + 1;
        int digitsSum = 0;
        int oddDigitsSum = 0;
        int maxDigit = number % 10;

        while (i <= digitsAmount) {
            int digit = (number / (int) Math.pow(10, i - 1)) % 10;

            if (digit > maxDigit) {
                maxDigit = digit;
            }

            if (digit % 2 != 0) {
                oddDigitsSum += digit;
            }

            digitsSum += digit;
            i++;
        }

        System.out.println("Sum of the digits: " + digitsSum);
        System.out.println("Sum of the odd digits: " + oddDigitsSum);
        System.out.println("Max digit is: " + maxDigit);
    }
}