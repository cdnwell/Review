package switchtest;

import java.util.Scanner;

public class EnhancedSwitch {
	/*
	 * 2020�� 3���� ��õ� Java 14���� ������ switch ���� �����մϴ�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int num = sc.nextInt();

			switch (num) {
			case 1 -> System.out.println("case 1!");
			//-> ������ �� ������ ��� �߰�ȣ�� �ʿ����.
			case 2 -> {
				System.out.println("case 2!");
				System.out.println("case2's line 2...");
			}
			case 3 -> {
				System.out.println("case 3!");
				System.out.println("case3's line 2...");
				System.out.println("case3's line 3.....");
			}
			}
		}
	}

}
