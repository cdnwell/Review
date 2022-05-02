package exception;

import java.util.Scanner;

public class Exception04 {

	public static int div(int n1,int n2) throws ArithmeticException{
//		int result = -1;
//		try {
//			result = n1 / n2;
//		}
		
		return n1 / n2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int n2 = sc.nextInt();
		try {
			System.out.println(div(n1,n2));
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}
