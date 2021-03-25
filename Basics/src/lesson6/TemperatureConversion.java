package lesson6;

import java.util.Scanner;

public class TemperatureConversion {
    public static double getDegreesFahrenheit(double degreesCelsius) {
        return degreesCelsius * 1.8 + 32;
    }

    public static double getKelvins(double degreesCelsius) {
        return degreesCelsius + 273.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру по Цельсию:");
        double degreesCelsius = scanner.nextDouble();

        if (degreesCelsius < -273.15) {
            System.out.println("Температура не может быть ниже -273,15 градусов по Цельсию");
        } else {
            double degreesFahrenheit = getDegreesFahrenheit(degreesCelsius);
            double kelvins = getKelvins(degreesCelsius);

            System.out.println("Температура по Фаренгейту равна: " + degreesFahrenheit);
            System.out.println("Температура по Кельвину равна: " + kelvins);
        }
    }
}