package day05;

import java.util.Arrays;

public class ArrayQuest03 {
	/*
	 * 배열 arr에 있는 모든 알파벳을 대문자로 변경 후 출력
	 */
	public static void main(String[] args) {
//		
//		char A='A';		//65
//		char a='a';		//97
//		char spc=' ';	//32
//		
//		알파벳 갯수 26개 1abcde 2fghij 3klmno 4pqrst 5uvwxy z
//		
//		System.out.println((int)A);
//		System.out.println((int)a);
//		System.out.println((int)spc);
//		
		String str="hello world";
		char[] arr=str.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>='a'&& arr[i]<='z')
			arr[i]=(char)(arr[i]-32);
			
		}
		
		//소문자로 바꾸기
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>='A' && arr[i]<='Z')
				arr[i]+=' ';
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
	}

}
