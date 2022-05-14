package day01;

public class ShortCircuit {

	public static void main(String[] args) {
		
		//단락회로
		//논리 연산자 OR은 앞의 조건이 참이면 뒤의 값과 상관없이 참이다.
		//이때 뒤의 값을 검사하지 않고 앞의 값만 검사한다.
		
		//논리 연산자 AND는 앞의 연산자가 거짓이면뒤의 값과 상관없이 거짓이다.
		//이떄 뒤의 값을 검사하지 않고 앞의 값만 검사한다.
		
		int n1 = 10, n2 = 5;
		boolean result;
		
		result = n1 > 5 || ++n2 < 3;
		System.out.println(result);
		System.out.println(n2);
		
		n2 = 5;
		result = n1 > 5 || ++n2 > 3;
		System.out.println(n2);
		
		//------or 비교연산자 : 처음 값이 참이라 뒤의 조건은 실행하지 않는다.
		
		n2 = 5;
		result = n1 < 5 || ++n2 < 3;
		System.out.println(n2);
		
		n2 = 5;
		result = n1 < 5 || ++n2 > 3;
		System.out.println(n2);
		
		//-------or 비교연산자 종료----------
		
		n2 = 5;
		result = n1 < 5 && ++n2 > 3;
		System.out.println(result);
		System.out.println(n2);
		
		n2=5;
		result = n1 < 5 && ++n2 < 3;
		System.out.println(n2);
		
		//--------and 비교연산자 : 처음 값이 거짓이라 뒤의 조건은 실행하지 않는다.
		
		n2 = 5;
		result = n1 > 5 && ++n2 > 3;
		System.out.println(n2);

		n2 = 5;
		result = n1 > 5 && ++n2 < 3;
		System.out.println(n2);
		
	}

}
