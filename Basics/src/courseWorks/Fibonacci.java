package courseWorks;

import java.util.Scanner;

public class Fibonacci {
    public static int getFibonacciNumber(int index) {
        if (index == 0) {
            return 0;
        }

        int previousFibonacciNumber = 0;
        int currentFibonacciNumber = 1;

        for (int i = 2; i <= index; i++) {
            int nextFibonacciNumber = previousFibonacciNumber + currentFibonacciNumber;
            previousFibonacciNumber = currentFibonacciNumber;
            currentFibonacciNumber = nextFibonacciNumber;
        }

        return currentFibonacciNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите индекс числа Фибоначчи: ");
        int index = scanner.nextInt();

        int fibonacciNumber = getFibonacciNumber(index);
        System.out.print("Число Фибоначчи: " + fibonacciNumber);
    }
}