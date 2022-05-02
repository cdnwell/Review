package calendar;

import java.time.*;

public class TimeClass {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		date=LocalDate.of(1920, 12, 25);
		System.out.println(date);
		
	}

}
