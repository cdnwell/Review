package day04;

import java.util.Scanner;

public class ForQuest02 {
	/*
	 * 숫자 0을 입력 할때까지
	 * 정수를 입력 받아서
	 * 0을 입력을 하면 입력한 숫자들의 총합과 평균을 출력
	 * 
	 * 숫자 입력 : 1
	 * 숫자 입력 : 5
	 * 숫자 입력 : -1
	 * 숫자 입력 : 2
	 * 숫자 입력 : 0
	 * 
	 * 총합 : 7
	 * 평균 : 1.75
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int count=0;
		int n = 1;
		double avr;
		
		for(;n!=0;) {
			System.out.print("정수 입력 : ");
			n=sc.nextInt();
			
			sum+=n;
			count++;
		}
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+((double)sum/(count-1)));
	}

}
