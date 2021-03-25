package courseWorks;

import java.util.Scanner;

public class MaxSubstring {
    public static int getMaxSubstringLength(String string) {
        if (string.length() == 0) {
            return 0;
        }

        int maxSubstringLength = 1;
        int currentSubstringLength = 1;

        for (int i = 0; i < string.length() - 1; i++) {
            if (Character.toLowerCase(string.charAt(i)) == Character.toLowerCase(string.charAt(i + 1))) {
                currentSubstringLength++;

                if (currentSubstringLength > maxSubstringLength) {
                    maxSubstringLength = currentSubstringLength;
                }
            } else {
                currentSubstringLength = 1;
            }
        }

        return maxSubstringLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String enteredString = scanner.nextLine();

        int maxSubstringLength = getMaxSubstringLength(enteredString);
        System.out.println("Длина максимальной подстроки: " + maxSubstringLength);
    }
}