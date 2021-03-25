package lesson2;

public class Circle {
    public static void main(String[] args) {
        double circleRadius = 10;
        double circleArea1 = Math.PI * Math.pow(circleRadius, 2);
        System.out.println("The area of a circle is: " + circleArea1);

        double circleLength2 = 2 * Math.PI * circleRadius;
        System.out.println("The length of a circle is: " + circleLength2);

        double circleRadius3 = Math.sqrt(circleArea1 / Math.PI);
        System.out.println("The radius of a circle is: " + circleRadius3);

        double angle = 180;
        double circleSectorArea4 = (Math.PI * Math.pow(circleRadius, 2) * angle) / 360;
        System.out.println("The area of a sector is: " + circleSectorArea4);
    }
}