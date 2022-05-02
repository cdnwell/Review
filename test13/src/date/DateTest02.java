package date;

import java.util.Date;

public class DateTest02 {

	public static void main(String[] args) {
		
		Date start = new Date(122,4,1);
		Date end = new Date(122,11,25);
		
		long diff = end.getTime()-start.getTime();
		diff= diff/(1000*60*60*24);
		System.out.println("2022년도 크리스마스 까지 남은 날짜...");
		System.out.println(diff);
		
	}

}
