package literal;

public class LiteralTest {

	public static void main(String[] args) {
		String str1= "str";
		String str2= "str";
		
		System.out.println(str1==str2);
		
		System.out.println();
		
		String str3=new String("str");
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		
		
		System.out.println();
		
		String str4="str";
		System.out.println(str1==str4);
		System.out.println(str2==str4);
		System.out.println(str3==str4);
		
		System.out.println();
		
		String str5=new String("str");
		System.out.println(str1==str5);
		System.out.println(str2==str5);
		System.out.println(str3==str5);
		System.out.println(str4==str5);
	}

}
