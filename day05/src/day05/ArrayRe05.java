package day05;

import java.util.Arrays;

public class ArrayRe05 {

	public static void main(String[] args) {
		int [] arr1=new int[4];
		double [] arr2=new double[4];
		String[] arr3=new String[4];
		boolean [] arr4=new boolean[4];
		char [] arr5=new char[4];
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println(arr5[0]=='\0');
	}

}
