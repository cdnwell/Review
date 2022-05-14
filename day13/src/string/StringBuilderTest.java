package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello World");
		System.out.println(str);
		str.append(100);				//문장의 마지막에 숫자 100을 추가한다.
		System.out.println(str);
		str.append("JAVA");				//문장의 마지막에 JAVA를 추가한다.
		System.out.println(str);
		str.replace(0, 5, "TEST");		//0,1,2,3,4(Hello)를 TEST로 바꾼다.
		System.out.println(str);
		str.delete(5,10);				//5,6,7,8,9(Hello)를 지운다. 
		System.out.println(str);
		
	}

}