package lesson9;

public class MaxNumberInArray {
    public static double getMaxNumberInArray(double[] array) {
        double maxNumber = array[0];

        for (double e : array) {
            if (e > maxNumber) {
                maxNumber = e;
            }
        }

        return maxNumber;
    }

    public static void main(String[] args) {
        double[] array = {5.1, 3.89, 47.8, 7, 19.14, 1, 2.4, 47.7};

        double maxNumber = getMaxNumberInArray(array);
        System.out.println("Максимальное число в массиве: " + maxNumber);
    }
}