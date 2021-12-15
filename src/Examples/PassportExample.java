package Examples;

import java.time.LocalDate;

public class PassportExample {
    public static void main(String[] args) {
        // Classes
        Passport ukPassport = new Passport("1234", "England (UK)", LocalDate.of(2025, 1, 1));

        Passport usPassport = new Passport("12399", "USA", LocalDate.of(2030, 1, 1));

        System.out.println("Lance");
        System.out.println(ukPassport.number);
        System.out.println(ukPassport.country);
        System.out.println(ukPassport.expiryDate);
        System.out.println();

        System.out.println("Pedro");
        System.out.println(usPassport.number);
        System.out.println(usPassport.country);
        System.out.println(usPassport.expiryDate);
        System.out.println();

    }

    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
}
