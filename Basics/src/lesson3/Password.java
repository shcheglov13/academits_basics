package lesson3;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String defaultPassword = "qwerty";

        System.out.println("Enter the password: ");
        String enteredPassword = scanner.nextLine();

        if (defaultPassword.equals(enteredPassword)) {
            System.out.println("The password is correct");
        } else if (defaultPassword.length() > enteredPassword.length()) {
            System.out.println("The password is wrong and too short");
        } else if (defaultPassword.length() < enteredPassword.length()) {
            System.out.println("The password is wrong and too long");
        } else {
            System.out.println("The password is wrong");
        }
    }
}