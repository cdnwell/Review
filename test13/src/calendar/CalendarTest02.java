package calendar;

import java.util.Calendar;

public class CalendarTest02 {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		cal.set(Calendar.YEAR, 1920);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 25);
		System.out.println(cal.getTime());
		System.out.println(cal);
		System.out.println(cal.toString());
	}

}
