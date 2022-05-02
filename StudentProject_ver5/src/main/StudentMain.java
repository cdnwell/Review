package main;

import java.util.Scanner;

import controller.Controller;
import controller.HandlerMapping;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("---- �л��������� ���α׷� ----");
			System.out.println("1. �л��������");
			System.out.println("2. �л�������ȸ");
			System.out.println("3. �л���������");
			System.out.println("4. �л���������");
			System.out.println("5. �л����� ��ü��ȸ");
			System.out.println("6. ��ü ���� 1�� ��ȸ");
			System.out.println("0. ���α׷� ����");
			System.out.print("���Ͻô� �޴���ȣ�� �Է��ϼ��� > ");
			int no = sc.nextInt();
			sc.nextLine();

			if (no == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

			Controller controller = HandlerMapping.getInstance().createController(no);

			if (controller != null)
				controller.execute(sc);

		}
	}

}
