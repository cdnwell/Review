package string;

import java.util.Arrays;
import java.util.ArrayList;

public class StringMain {

	public static void main(String[] args) {
		String str1 = "Hello World";
		byte[] arr = str1.getBytes();
		System.out.println(Arrays.toString(arr));		
		//byte 타입으로 변경되면서 각 글자가 ASCII코드 값으로 바뀌었다.
		System.out.println(str1.charAt(0));
		
		String str2 = "Hello World Hello Java World";
		System.out.println(str2.indexOf("World"));
		//문자열 처음부터 검색
		System.out.println(str2.indexOf("World",7));
		//문자열 7번 인덱스부터 검색
		System.out.println(str2.lastIndexOf("World"));
		//문자열 끝에서부터 검색
		System.out.println(str2.lastIndexOf("World",22));
		//문자열 22번부터 앞으로 검색
		System.out.println(str2.toUpperCase());
		//모든 글자 대문자로 변경
		System.out.println(str2.toLowerCase());
		//모든 글자 소문자로 변경
		System.out.println(str2.length());
		//글자 길이
		System.out.println(str2.substring(10));
		//문자열 10번부터 마지막까지 잘라서 리턴
		System.out.println(str2.substring(10,15));
		//문자열 10번부터 15번까지 잘라서 리턴(실제 표시되는 값은 10번부터 14번까지)
		System.out.println(str2.replace("Hello", "Hell"));
		
		String str3="   Hello World     ";
		System.out.println(str3);
		System.out.println(str3.length());
		System.out.println(str3.trim());
		System.out.println(str3.trim().length());
		
		ArrayList <String> list = new ArrayList <String>();
		
		list.add("Java");
		list.add("HTML/CSS");
		list.add("Android");
		list.add("jsp");
		list.add("js/jQuery");
		
		String str4="";
		for(String s : list) {
			str4 += s + " ";
		}
		
		str4 = str4.trim();
		System.out.println(str4+" "+str4.length());
		String str5 = String.join(" ", list);
		System.out.println(str5+" "+str5.length());
		
		String [] arr2 = str5.split(" ");
		System.out.println(Arrays.toString(arr2));
		
		
	}

}
