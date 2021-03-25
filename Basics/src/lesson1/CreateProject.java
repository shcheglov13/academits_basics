package lesson1;

public class CreateProject {
    public static void main(String[] args) {
        int a = 213;
        int b = 57;

        int result = (int) (Math.pow(a, 3) + 3 * Math.pow(a, 2) * b + 3 * a * Math.pow(b, 2) - Math.pow(b, 3));
        System.out.println("The result of this expression is: " + result);
    }
}