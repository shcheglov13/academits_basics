package courseWorks;

import java.util.Scanner;

public class QuadraticEquation {
    private final static double EPSILON = 1e-6;

    public static void printQuadraticEquationRoots(double a, double b, double c) {
        System.out.println("Квадратное уравнение: ");

        double discriminant = b * b - 4 * a * c;

        if (discriminant > EPSILON) {
            double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + "; x2 = " + x2);
        } else if (Math.abs(discriminant) <= EPSILON) {
            double x = -b / (2 * a);
            System.out.println("Корень уравнения: x = " + x);
        } else {
            System.out.println("Действительных корней нет");
        }
    }

    public static void printLinearEquationRoot(double b, double c) {
        System.out.println("Линейное уравнение: ");

        double x = -c / b;
        System.out.println("Корень уравнения: x = " + x);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэффициент a: ");
        double a = scanner.nextDouble();

        System.out.println("Введите коэффициент b: ");
        double b = scanner.nextDouble();

        System.out.println("Введите коэффициент c: ");
        double c = scanner.nextDouble();

        if (Math.abs(a) > EPSILON) {
            printQuadraticEquationRoots(a, b, c);
        } else if (Math.abs(b) > EPSILON) {
            printLinearEquationRoot(b, c);
        } else if (Math.abs(c) <= EPSILON) {
            System.out.println("Уравнение имеет бесконечное количество корней");
        } else {
            System.out.println("Уравнение не имеет корней");
        }
    }
}