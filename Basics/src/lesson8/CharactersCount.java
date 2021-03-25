package lesson8;

import java.util.Scanner;

public class CharactersCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String enteredString = scanner.nextLine();

        int lettersCount = 0;
        int digitsCount = 0;
        int spacesCount = 0;
        int otherCharactersCount = 0;

        for (int i = 0; i < enteredString.length(); i++) {
            if (Character.isLetter(enteredString.charAt(i))) {
                lettersCount++;
            } else if (Character.isDigit(enteredString.charAt(i))) {
                digitsCount++;
            } else if (Character.isWhitespace(enteredString.charAt(i))) {
                spacesCount++;
            } else {
                otherCharactersCount++;
            }
        }

        System.out.println("Количество букв в строке: " + lettersCount);
        System.out.println("Количество цифр в строке: " + digitsCount);
        System.out.println("Количество пробелов в строке: " + spacesCount);
        System.out.println("Количество остальных символов в строке: " + otherCharactersCount);
    }
}