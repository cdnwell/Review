package quest;

import java.util.Scanner;

public class StringQuest {

	public static String convertor(char ch) {
		if(ch >= '��' && ch < '��')
			return "��";
		else if(ch >= '��' && ch < '��')
			return "��";
		else if(ch >= '��' && ch < '��')
			return "��";
		else if(ch >= '��' && ch < '��')
			return "��";
		else if(ch >= '��' && ch < '��')
			return "��";
		else if(ch >= '��' && ch < '��')
			return "��";
		else if(ch >= '��' && ch < '��')
			return "��";
		else if(ch >= '��' && ch < '��')
			return "��";
		else if(ch >= '��' && ch < '��')
			return "��";
		else if(ch >= '��' && ch < '��')
			return "��";
		else if(ch >= '��' && ch < '��')
			return "��";
		else if(ch >= '��' && ch < '��')
			return "��";
		else if(ch >= '��' && ch < '¥')
			return "��";
		else if(ch >= '¥' && ch < '��')
			return "��";
		else if(ch >= '��' && ch < 'ī')
			return "��";
		else if(ch >= 'ī' && ch < 'Ÿ')
			return "��";
		else if(ch >= 'Ÿ' && ch < '��')
			return "��";
		else if(ch >= '��' && ch < '��')
			return "��";
		else if(ch >= '��' && ch <= '�R')
			return "��";
		return " ";
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str=sc.nextLine();
		String result = new String();
		for(int i=0;i<str.length();i++) {
			result += convertor(str.charAt(i));
		}
		System.out.println(result);
	}

}
