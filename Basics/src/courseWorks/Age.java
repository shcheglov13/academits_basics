package courseWorks;

import java.util.Scanner;

public class Age {
    public static String getAgeInCorrectDeclension(int age) {
        int lastDigit = age % 10;
        int previousLastDigit = age / 10 % 10;

        if (previousLastDigit == 1) {
            return "Вам " + age + " лет";
        }

        switch (lastDigit) {
            case 1:
                return "Вам " + age + " год";
            case 2:
            case 3:
            case 4:
                return "Вам " + age + " года";
            default:
                return "Вам " + age + " лет";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите свой возраст: ");
        int age = scanner.nextInt();

        if (age > 112) {
            System.out.println("Вы слишком стары");
        } else if (age < 1) {
            System.out.println("Вы слишком малы");
        } else {
            String ageInCorrectDeclension = getAgeInCorrectDeclension(age);
            System.out.println(ageInCorrectDeclension);
        }
    }
}