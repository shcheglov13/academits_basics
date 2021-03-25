package courseWorks;

public class Palindrome {
    public static boolean isPalindrome(String string) {
        for (int i = 0, j = string.length() - 1; i < j; i++, j--) {
            if (Character.isLetter(string.charAt(i)) && Character.isLetter(string.charAt(j))) {
                if (Character.toLowerCase(string.charAt(i)) != Character.toLowerCase(string.charAt(j))) {
                    return false;
                }
            } else if (!Character.isLetter(string.charAt(i))) {
                j++;
            } else {
                i--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String string = "Аргентина манит негра";

        if (isPalindrome(string)) {
            System.out.println("Данная строка является палиндромом");
        } else {
            System.out.println("Данная строка не является палиндромом");
        }
    }
}