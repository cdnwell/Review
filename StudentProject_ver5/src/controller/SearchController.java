package controller;

import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class SearchController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("�л���ȣ�� �̿��ؼ� ��ȸ�� �����մϴ�...........");
		System.out.print("��ȸ�� �й� �Է� : ");
		String studentNo=sc.nextLine();
		StudentVO vo;
		try {
			vo = StudentService.getInstance().searchStudent(studentNo);
			vo.printStudentInfo();
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}//if�� ���ʿ���� try catch������ ���� ����
	}

}
