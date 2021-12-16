package Java8Features.DateAndTime.LocalDateClass;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateExample3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017,1,13);
        LocalDateTime dateTime = date.atTime(1,50,9);
        System.out.println(dateTime);
    }
}
