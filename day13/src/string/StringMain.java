package string;

import java.util.Arrays;
import java.util.ArrayList;

public class StringMain {

	public static void main(String[] args) {
		String str1 = "Hello World";
		byte[] arr = str1.getBytes();
		System.out.println(Arrays.toString(arr));		
		//byte Ÿ������ ����Ǹ鼭 �� ���ڰ� ASCII�ڵ� ������ �ٲ����.
		System.out.println(str1.charAt(0));
		
		String str2 = "Hello World Hello Java World";
		System.out.println(str2.indexOf("World"));
		//���ڿ� ó������ �˻�
		System.out.println(str2.indexOf("World",7));
		//���ڿ� 7�� �ε������� �˻�
		System.out.println(str2.lastIndexOf("World"));
		//���ڿ� ���������� �˻�
		System.out.println(str2.lastIndexOf("World",22));
		//���ڿ� 22������ ������ �˻�
		System.out.println(str2.toUpperCase());
		//��� ���� �빮�ڷ� ����
		System.out.println(str2.toLowerCase());
		//��� ���� �ҹ��ڷ� ����
		System.out.println(str2.length());
		//���� ����
		System.out.println(str2.substring(10));
		//���ڿ� 10������ ���������� �߶� ����
		System.out.println(str2.substring(10,15));
		//���ڿ� 10������ 15������ �߶� ����(���� ǥ�õǴ� ���� 10������ 14������)
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
