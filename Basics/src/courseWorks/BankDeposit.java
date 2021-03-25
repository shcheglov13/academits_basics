package courseWorks;

import java.util.Scanner;

public class BankDeposit {
    private final static int MONTHS_IN_YEAR_COUNT = 12;
    private final static double COEFFICIENT_FOR_CONVERSION_TO_PERCENT = 0.01;

    public static double getInvestment(double initialInvestment, double interestRate, int monthsCount) {
        double interestPerMonth = (interestRate / MONTHS_IN_YEAR_COUNT) * COEFFICIENT_FOR_CONVERSION_TO_PERCENT;
        double totalInvestment = initialInvestment;

        for (int i = 0; i < monthsCount; i++) {
            double monthlyProfit = interestPerMonth * totalInvestment;
            totalInvestment += monthlyProfit;
        }

        return totalInvestment;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        double initialInvestment = scanner.nextDouble();

        System.out.print("Введите процентную ставку годовых (%): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Введите на сколько месяцев будет открыт вклад: ");
        int monthsCount = scanner.nextInt();

        double totalInvestment = getInvestment(initialInvestment, interestRate, monthsCount);
        System.out.println("Баланс на счете после окончания вклада: " + totalInvestment);

        double profit = totalInvestment - initialInvestment;
        System.out.println("Чистая прибыль: " + profit);
    }
}