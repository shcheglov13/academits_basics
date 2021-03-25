package lesson2;

public class Expressions {
    public static void main(String[] args) {
        double x = 3 - ((56 - 12) / 44) * (4 / 2);
        System.out.println("The result of x: " + x);

        double y = 2 * x / (33 - x);
        System.out.println("The result of y: " + y);

        double z = -x / (2 * y);
        System.out.println("The result of z: " + z);
    }
}
