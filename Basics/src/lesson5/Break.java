package lesson5;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fixedString = "Secret";

        for (; ; ) {
            System.out.println("Try to guess the word:");
            String enteredString = scanner.nextLine();

            if (enteredString.equals(fixedString)) {
                System.out.print("You guessed the word!");
                break;
            }

            System.out.println("No, try again");
        }
    }
}