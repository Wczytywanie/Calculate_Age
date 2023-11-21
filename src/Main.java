import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int person;
        do {
            System.out.print("Podaj ilość osób których wiek chcesz obliczyć: ");
            while (!scanner.hasNextInt()) {
                System.out.println("To nie jest liczba. Podaj liczbę osób: ");
                scanner.next();
            }
            person = scanner.nextInt();
        } while (person <= 0);

        int allAge = 0;
        for (int i = 1; i <= person; i++) {
            String name;
            System.out.println(" Podaj imię osoby, której wiek chcesz obliczyć : ");
            name = scanner.next();

            System.out.print("Podaj rok urodzenia " + name + ": ");
            int birthYear;
            do {
                while (!scanner.hasNextInt()) {
                    System.out.println("To nie jest liczba. Podaj rok urodzenia: ");
                    scanner.next();
                }
                birthYear = scanner.nextInt();
                if (birthYear < 1900 || birthYear > LocalDate.now().getYear()) {
                    System.out.println("Rok urodzenia musi być z przedziału 1900 do aktualnej daty.");
                    System.out.print("Podaj rok urodzenia   : ");
                }
            } while (birthYear < 1900 || birthYear > LocalDate.now().getYear());

            int age = LocalDate.now().getYear() - birthYear;
            allAge += age;
            System.out.println(name + "  ma " + age + " lat.");
        }

        System.out.println("Suma wieków podanych osób wynosi: " + allAge + " lat.");
    }
}
