package scanner;

import java.util.Scanner;

public class NextIntDouble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력해주세요 : ");
//		int num = sc.nextInt();
//		System.out.print("문자열을 입력해주세요 : ");
//		String str = sc.nextLine();
		
//		System.out.print("실수를 입력해주세요 : ");
//		double num1=sc.nextDouble();
//		sc.nextLine();
//		System.out.print("문자열을 입력해주세요 : ");
//		String str1 =sc.nextLine();
		
		System.out.print("실수를 입력해주세요 : ");
		double num2=sc.nextDouble();
		System.out.print("정수를 입력해주세요 : ");
		int num3=sc.nextInt();
//		System.out.print("문자열을 입력해주세요 : ");
//		String str1 =sc.nextLine();
		
		//실수, 정수 연속으로 와도 nextLine을 안적어 줘도 도된다. 
		//하지만 그 뒤에 nextLine이 오면 꼭 그 이전에 sc.nextLine으로 엔터값을 없애주어야한다.

		
	}

}
