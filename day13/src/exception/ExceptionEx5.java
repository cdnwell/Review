package exception;

import java.util.Scanner;

public class ExceptionEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		try {
			if(age<1)
				throw new UserException("나이는 1이상 입력하세요");
			if(age > 19)
				System.out.println("성인입니다.");
			else
				System.out.println("미성년자입니다.");
		}catch(UserException e) {
			e.printStackTrace();
		}
		
		
	}

}
