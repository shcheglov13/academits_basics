package lesson12;

public class NumbersStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            stringBuilder.append(i).append(", ");
        }

        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());

        String result = stringBuilder.toString();
        System.out.print(result);
    }
}