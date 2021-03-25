package lesson4.classwork;

public class Task3 {
    public static void main(String[] args) {
        int i = 3;
        int sum = 0;
        int evenCount = 0;
        while (i <= 21){
            if (i % 2 == 0) {
                sum += i;
                evenCount++;
            }
            i++;
        }

        System.out.println(sum);
        System.out.println(evenCount);
    }
}
