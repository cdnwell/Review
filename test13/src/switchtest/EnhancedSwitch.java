package switchtest;

import java.util.Scanner;

public class EnhancedSwitch {
	/*
	 * 2020년 3월에 출시된 Java 14부터 개선된 switch 문을 지원합니다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int num = sc.nextInt();

			switch (num) {
			case 1 -> System.out.println("case 1!");
			//-> 다음에 한 문장일 경우 중괄호가 필요없다.
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
