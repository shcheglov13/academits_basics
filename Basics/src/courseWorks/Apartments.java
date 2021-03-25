package courseWorks;

import java.util.Scanner;

public class Apartments {
    private final static int APARTMENTS_PER_FLOOR_COUNT = 4;

    public static void printApartmentLocation(int floorsCount, int apartmentNumber) {
        int apartmentsInEntranceCount = floorsCount * APARTMENTS_PER_FLOOR_COUNT;
        int entranceNumber = ((apartmentNumber - 1) / apartmentsInEntranceCount) + 1;
        System.out.println("Номер подъезда: " + entranceNumber);

        int floorNumber = (((apartmentNumber - (entranceNumber - 1) * apartmentsInEntranceCount) - 1) / APARTMENTS_PER_FLOOR_COUNT) + 1;
        System.out.println("Номер этажа: " + floorNumber);

        switch (apartmentNumber % APARTMENTS_PER_FLOOR_COUNT) {
            case 1:
                System.out.println("Ближняя слева");
                break;
            case 2:
                System.out.println("Дальняя слева");
                break;
            case 3:
                System.out.println("Дальняя справа");
                break;
            case 0:
                System.out.println("Ближняя справа");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество этажей: ");
        int floorsCount = scanner.nextInt();

        System.out.print("Введите количество подъездов: ");
        int entrancesCount = scanner.nextInt();

        System.out.print("Введите номер желаемой квартиры: ");
        int apartmentNumber = scanner.nextInt();

        if (apartmentNumber > floorsCount * entrancesCount * APARTMENTS_PER_FLOOR_COUNT || apartmentNumber < 1) {
            System.out.println("Квартиры с таким номером нет");
        } else {
            printApartmentLocation(floorsCount, apartmentNumber);
        }
    }
}