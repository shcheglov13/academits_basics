package lesson7.classwork;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("Petr", "Isupov", "+7(923)166-21-80");

        String name = contact.getName();
        String surname = contact.getSurname();
        String phoneNumber = contact.getPhoneNumber();

        System.out.println(name);
        System.out.println(surname);
        System.out.println(phoneNumber);

        contact.setName("Ivan");
        contact.setSurname("Validolov");
        contact.setPhoneNumber("+7(903)178-24-13");

        name = contact.getName();
        surname = contact.getSurname();
        phoneNumber = contact.getPhoneNumber();

        System.out.println(name);
        System.out.println(surname);
        System.out.println(phoneNumber);
    }
}