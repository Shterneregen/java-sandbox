package random.other.dates;

import java.time.LocalDate;

public class GetDateOfWeek {

    public static void main(String[] args) {
        System.out.println(findDay(8, 5, 2015));
    }

    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        return String.valueOf(localDate.getDayOfWeek());
    }

}