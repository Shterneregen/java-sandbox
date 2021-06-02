package random;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	    LocalDate now = LocalDate.now();
	    DayOfWeek dayOfWeek = now.plusYears(1).getDayOfWeek();
	    System.out.println(dayOfWeek);
    }

}
