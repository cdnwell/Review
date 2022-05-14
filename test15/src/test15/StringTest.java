package test15;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		String str="Hello World";
		boolean result="안녕하세요".equals("안녕하세요");
		
		System.out.println(result);
		
		char[] arr;
		arr=str.toCharArray();
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();	
		System.out.println();
		System.out.println(str.charAt(0));
	}
	
}
