package random.java8.streams;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

/**
 * LocalTime.MIN --> {00:00},
 * LocalTime.MAX --> {23:59:59.999999999},
 * LocalTime.MIDNIGHT --> {00:00},
 * LocalTime.NOON --> {12:00}.
 */
public class DateExamples {

	public static void main(String[] args) {
		Period period = Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2);
//		Period period = Period.ofDays(2);
		System.out.println(period);

		Period period1 = Period.of(0, 0, 0);
		System.out.println(period1);


		LocalDate date = LocalDate.parse("1947-08-14");
		LocalTime time = LocalTime.MAX;
		System.out.println(date.atTime(time)); // 1947-08-14T23:59:59.999999999


		// date.atTime(LocalTime) method creates a LocalDateTime instance by combining date and time parts.
		// toString() method of LocalDateTime class prints the date and time parts separated by T in upper case.

		LocalDateTime obj = LocalDateTime.now();
		System.out.println(obj.getSecond());

		// LocalDateTime stores both date and time parts.
		// LocalDateTime.now(); retrieves the current date and time from the system clock. obj.getSecond() can return any value between 0 and 59.
	}
}
