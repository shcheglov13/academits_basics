package lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OccurrencesCount {
    public static int getStringOccurrencesCount(String currentString, String stringForSearch) {
        currentString = currentString.toLowerCase();
        stringForSearch = stringForSearch.toLowerCase();

        int index = currentString.indexOf(stringForSearch);
        int occurrencesCount = 0;

        while (index != -1) {
            index = currentString.indexOf(stringForSearch, index + stringForSearch.length());
            occurrencesCount++;
        }

        return occurrencesCount;
    }

    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            String stringForSearch = "word";
            int occurrencesCount = 0;

            while (scanner.hasNextLine()) {
                occurrencesCount += getStringOccurrencesCount(scanner.nextLine(), stringForSearch);
            }

            System.out.println("Число вхождений: " + occurrencesCount);
        }
    }
}