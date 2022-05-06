package quest;

import java.util.Scanner;

public class StringQuest {

	public static String convertor(char ch) {
		if(ch >= '°¡' && ch < '±î')
			return "¤¡";
		else if(ch >= '±î' && ch < '³ª')
			return "¤¢";
		else if(ch >= '³ª' && ch < '´Ù')
			return "¤¤";
		else if(ch >= '´Ù' && ch < 'µû')
			return "¤§";
		else if(ch >= 'µû' && ch < '¶ó')
			return "¤¨";
		else if(ch >= '¶ó' && ch < '¸¶')
			return "¤©";
		else if(ch >= '¸¶' && ch < '¹Ù')
			return "¤±";
		else if(ch >= '¹Ù' && ch < 'ºü')
			return "¤²";
		else if(ch >= 'ºü' && ch < '»ç')
			return "¤³";
		else if(ch >= '»ç' && ch < '½Î')
			return "¤µ";
		else if(ch >= '½Î' && ch < '¾Æ')
			return "¤¶";
		else if(ch >= '¾Æ' && ch < 'ÀÚ')
			return "¤·";
		else if(ch >= 'ÀÚ' && ch < 'Â¥')
			return "¤¸";
		else if(ch >= 'Â¥' && ch < 'Â÷')
			return "¤¹";
		else if(ch >= 'Â÷' && ch < 'Ä«')
			return "¤º";
		else if(ch >= 'Ä«' && ch < 'Å¸')
			return "¤»";
		else if(ch >= 'Å¸' && ch < 'ÆÄ')
			return "¤¼";
		else if(ch >= 'ÆÄ' && ch < 'ÇÏ')
			return "¤½";
		else if(ch >= 'ÇÏ' && ch <= 'ÆR')
			return "¤¾";
		return " ";
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("¹®ÀÚ¿­ ÀÔ·Â : ");
		String str=sc.nextLine();
		String result = new String();
		for(int i=0;i<str.length();i++) {
			result += convertor(str.charAt(i));
		}
		System.out.println(result);
	}

}
