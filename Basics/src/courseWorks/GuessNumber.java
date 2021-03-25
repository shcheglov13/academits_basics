package courseWorks;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int attemptsCount = 0;
        int enteredNumber = 0;

        while (enteredNumber != randomNumber) {
            System.out.print("Введите ваше число: ");
            enteredNumber = scanner.nextInt();

            attemptsCount++;

            if (enteredNumber == randomNumber) {
                System.out.println("Вы отгадали число!");
                System.out.println("Число попыток: " + attemptsCount);
            } else if (enteredNumber > randomNumber) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
    }

    public static void main(String[] args) {
        playGame();
    }
}