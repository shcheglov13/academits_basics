package lesson6;

import java.util.Scanner;

public class OrderCost {
    private final static double DISCOUNT_FOR_ALL_TRUE_CONDITIONS = 0.9;
    private final static double DISCOUNT_FOR_ONE_TRUE_CONDITION = 0.95;
    private final static double MIN_ORDER_COST_FOR_DISCOUNT = 1000;
    private final static int MIN_PRODUCTS_COUNT_FOR_DISCOUNT = 10;

    public static double getDiscountedOrderCost(int type1ProductsCount, double type1ProductPrice, int type2ProductsCount, double type2ProductPrice) {
        double orderCost = type1ProductsCount * type1ProductPrice + type2ProductsCount * type2ProductPrice;
        int productsCount = type1ProductsCount + type2ProductsCount;

        if (orderCost >= MIN_ORDER_COST_FOR_DISCOUNT && productsCount >= MIN_PRODUCTS_COUNT_FOR_DISCOUNT) {
            return orderCost * DISCOUNT_FOR_ALL_TRUE_CONDITIONS;
        }

        if (orderCost >= MIN_ORDER_COST_FOR_DISCOUNT || productsCount >= MIN_PRODUCTS_COUNT_FOR_DISCOUNT) {
            return orderCost * DISCOUNT_FOR_ONE_TRUE_CONDITION;
        }

        return orderCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество товара №1:");
        int type1ProductsCount = scanner.nextInt();

        System.out.println("Введите количество товара №2:");
        int type2ProductsCount = scanner.nextInt();

        double type1ProductPrice = 100;
        double type2ProductPrice = 150;

        double discountedOrderCost = getDiscountedOrderCost(type1ProductsCount, type1ProductPrice, type2ProductsCount, type2ProductPrice);
        System.out.println("Стоимость заказа составит: " + discountedOrderCost + " руб.");
    }
}