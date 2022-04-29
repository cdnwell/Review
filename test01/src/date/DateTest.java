package date;

import java.util.Date;

public class DateTest {
	/*
	 * 1. 2023년도 12.25일부터 오늘까지 몇 일인지 2. 오늘 날짜 표시
	 * 
	 */
	public static void main(String[] args) {
		// 1. 2023년도 12.25일부터 오늘까지 몇 일인지
		Date date = new Date(0, 0, 0); // 1899.12.31
		System.out.println(date);
		date = new Date(10, 0, 0);
		System.out.println(date);
		Date start = new Date(0, 0, 1);
		System.out.println(start); // 1900.01.01

		System.out.println();

		start = new Date(122, 3, 29);
		Date end = new Date(123, 11, 25);
		System.out.println(end);
		System.out.println("부터\n" + start + "\n까지");
		long diff = end.getTime() - start.getTime();
		diff = diff / (1000 * 60 * 60 * 24);
		System.out.println(diff + "일 남았습니다.");

		System.out.println();
		
		// 2. 오늘 날짜 표시
		Date today = new Date();
		System.out.println(today.toString());
		System.out.println(today);
		// 모든 객체는 toString()메소드를 가진다.
		// 객체의 값을 부르면 toString을 실행시킨다.

	}

}
