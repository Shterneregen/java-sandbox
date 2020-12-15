package random.oca_mock_1;

import java.time.LocalDate;
import java.time.LocalTime;

public class _13 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("1947-08-14");
        LocalTime time = LocalTime.MAX;
        System.out.println(date.atTime(time));
    }
}

// LocalTime.MIN --> {00:00},
// LocalTime.MAX --> {23:59:59.999999999},
// LocalTime.MIDNIGHT --> {00:00},
// LocalTime.NOON --> {12:00}.
// date.atTime(LocalTime) method creates a LocalDateTime instance by combining date and time parts.
// toString() method of LocalDateTime class prints the date and time parts separated by T in upper case.