package date;

import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
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
		System.out.println("����\n" + start + "\n����");
		long diff = end.getTime() - start.getTime();
		diff = diff / (1000 * 60 * 60 * 24);
		System.out.println(diff + "�� ���ҽ��ϴ�.");

		System.out.println();
		
		Date today = new Date();
		System.out.println(today.toString());
		System.out.println(today);

	}

}
