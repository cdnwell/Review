package day04;

import java.util.Scanner;

public class ForQuest1RE {
	/*
	 * 두 개의 정수를 입력 받은 후
	 * 입력한 값중 작은 값부터 큰 값까지의 합을 출력
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum=0;
		
		System.out.print("정수 입력 : ");
		int num1=sc.nextInt();
		System.out.print("정수 입력 : ");
		int num2=sc.nextInt();
		
		//num1이 작은 값이다.
		if(num1>num2) {
			int temp=num1;
			num1=num2;
			num2=temp;
		}

		for(int i=num1;i<=num2;i++) {
			sum += i;
		}
		
		System.out.println("총합 : "+sum);
	}

}
