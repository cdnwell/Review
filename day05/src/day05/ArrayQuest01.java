package day05;

import java.util.Scanner;

public class ArrayQuest01 {
	/*
	 * 정수형 배열 길이가 10개인 배열을 생성한 후 
	 * 정수를 입력받아서 배열에 각 요소에 전부 입력을 한 후
	 * 배열에 있는 값들 중 제일 큰값, 제일 작은값을 출력 
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[10];
		
		for(int i=0;i<10;i++) {
			System.out.print("정수 입력:");
			arr[i]=sc.nextInt();
		}
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<10;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
	}

}
