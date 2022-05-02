package controller;

import java.util.Scanner;

import exception.StudentException;
import service.StudentService;

public class DeleteController implements Controller {

	public void execute(Scanner sc) {

		try {
			System.out.println("�л����� ������ �����մϴ�........");
			System.out.print("������ �й��� �Է��ϼ��� : ");
			String studentNo = sc.nextLine();

			StudentService.getInstance().deleteStudent(studentNo);

			System.out.println("�л� ������ ���������� ���� �Ǿ����ϴ�.");
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}

}
