package exception;

import java.util.Scanner;

public class ExceptionEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		try {
			if(age<1)
				throw new UserException("���̴� 1�̻� �Է��ϼ���");
			if(age > 19)
				System.out.println("�����Դϴ�.");
			else
				System.out.println("�̼������Դϴ�.");
		}catch(UserException e) {
			e.printStackTrace();
		}
		
		
	}

}
