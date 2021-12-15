package JavaRefresher;

import java.time.LocalDate;

public class ReferenceDataTypes {
    public static void main(String[] args) {
        // Non primitive data types AKA reference types
        String name = new String("Lance");
        System.out.println(name);
        LocalDate now =LocalDate.now();
        System.out.println(now.getMonth());

    }
}
