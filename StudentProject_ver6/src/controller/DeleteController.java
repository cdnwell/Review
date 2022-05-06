package controller;

import java.util.Scanner;

import exception.StudentException;
import service.StudentService;

public class DeleteController implements Controller {

	public void execute(Scanner sc) {

		System.out.println("�л����� ������ �����մϴ�........");
		System.out.print("������ �й��� �Է��ϼ��� : ");
		String studentNo = sc.nextLine();
		
		if(StudentService.getInstance().deleteStudent(studentNo)) {
			System.out.println("�л� ������ ���������� ���� �Ǿ����ϴ�.");
			StudentService.getInstance().updateFile();
		}else {
			System.out.println("������ �л� ������ �����ϴ�.");
		}
		
	}

}
