package JavaRefresher;

import java.time.LocalDate;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        // Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scan.nextLine();
        System.out.println("Hello " + userName);

        System.out.println("How old are you?");
        int age = scan.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + year);

        if (age < 18) {
            System.out.println("and you are not an adult");
        } else {
            System.out.println("and you are an adult :)");
        }
    }
}
