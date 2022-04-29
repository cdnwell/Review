package literal;

public class LiteralTest {

	public static void main(String[] args) {
		String str1= "str";
		String str2= "str";
		
		System.out.println(str1==str2);
		//String Constant Pool에 str이 등록되었다.
		//str1과 str2가 "str"이라는 상수를 가리키는 주소값을 갖고있다.
		//두 값이 같아서 true가 나온다.
		
		System.out.println();
		
		String str3=new String("str");
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		
		
		System.out.println();
		
		String str4="str";
		System.out.println(str1==str4);
		System.out.println(str2==str4);
		System.out.println(str3==str4);
		//str1,str2,str4는 같은 주소를 가리키고 있는 것으로 나타난다.
		//이후에 생성된 str5(생성자로 str을 생성), str3(마찬가지)과는 다른 주소를 가리키는
		//것으로 나온다.
		
		System.out.println();
		
		String str5=new String("str");
		System.out.println(str1==str5);
		System.out.println(str2==str5);
		System.out.println(str3==str5);
		System.out.println(str4==str5);
	}

}
