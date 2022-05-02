package calendar;

import java.util.Calendar;

public class CalendarTest{

	public static void main(String[] args) {
		
		final int num =10;
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 1900);
		System.out.println(calendar.getTime());
		String str = "hello world!";
	}

}
