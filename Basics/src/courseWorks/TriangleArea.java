package courseWorks;

import java.util.Scanner;

public class TriangleArea {
    public static double getTriangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double lineSegmentLength1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double lineSegmentLength2 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        double lineSegmentLength3 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));

        double semiPerimeter = (lineSegmentLength1 + lineSegmentLength2 + lineSegmentLength3) / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - lineSegmentLength1) * (semiPerimeter - lineSegmentLength2)
                * (semiPerimeter - lineSegmentLength3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты точки A");
        System.out.println("По оси X:");
        double x1 = scanner.nextDouble();

        System.out.println("По оси Y:");
        double y1 = scanner.nextDouble();

        System.out.println("Введите координаты точки B");
        System.out.println("По оси X:");
        double x2 = scanner.nextDouble();

        System.out.println("По оси Y:");
        double y2 = scanner.nextDouble();

        System.out.println("Введите координаты точки C");
        System.out.println("По оси X:");
        double x3 = scanner.nextDouble();

        System.out.println("По оси Y:");
        double y3 = scanner.nextDouble();

        double epsilon = 0.0001;

        if (Math.abs(((x1 - x2) * (y3 - y2)) - ((x3 - x2) * (y1 - y2))) < epsilon) {
            System.out.println("Точки вершин лежат на одной прямой");
        } else {
            double triangleArea = getTriangleArea(x1, y1, x2, y2, x3, y3);
            System.out.println("Площадь треугольника по заданным вершинам равна: " + triangleArea);
        }
    }
}