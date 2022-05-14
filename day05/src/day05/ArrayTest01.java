package day05;

import java.util.Arrays;

public class ArrayTest01 {

	public static void main(String[] args) {
		String str="Hello World";
		char[] arr= str.toCharArray();
		
		for(int start=0;start<(arr.length/2);start++) {
			char tmp=arr[start];
			arr[start]=arr[arr.length-1-start];
			arr[arr.length-1-start]=tmp;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
