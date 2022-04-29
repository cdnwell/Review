package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatMain {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date d1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy"); // ���� 4�ڸ�
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("yy"); // ���� 2�ڸ�
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MMMM"); // �������� ��
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MMM"); // �������� ��
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MM"); // �� 2�ڸ�
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("M"); // �� 1�ڸ�
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("dd"); // �� 2�ڸ�
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("d"); // �� 1�ڸ�
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("E"); // ���� 1�ڸ�
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("EEEE"); // ���� Ǯ����
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("HH"); // �ð� 2�ڸ�
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("H");	// �ð� 1�ڸ�
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("KK");	// �ð� 2�ڸ� - 12�ð� ����
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("K");	// �ð� 1�ڸ� - 12�ð� ����
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("mm");	// �� 2�ڸ�
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("m");	// �� 1�ڸ�
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("ss");	// �� 2�ڸ�
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("s");	// �� 1�ڸ�
		System.out.println(sdf.format(cal.getTime()));
		
		//Quiz01]
		//2022-04-29 12:22:50
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		//2022�� 04�� 29�� 12�� 22�� 50��
		sdf.applyPattern("yyyy�� MM�� dd�� HH�� mm�� ss��");
		System.out.println(sdf.format(cal.getTime()));
	}

}
