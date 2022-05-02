package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class UpdateController implements Controller {
	/*
	 * updatecontroller�� ���񽺰� �ʿ����� �ʰ� controller������ ����ȴ�.
	 */

	@Override
	public void execute(Scanner sc) {
		System.out.println("�л� ���� ������ �����մϴ�........");
		System.out.print("������ �л���ȣ �Է� : ");
		String studentNo = sc.nextLine();
		StudentVO vo;
		try {
			vo = StudentService.getInstance().searchStudent(studentNo);
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("�а� : ");
			String major = sc.nextLine();
			System.out.print("��� : ");
			double score = sc.nextDouble();
			sc.nextLine();

			vo.setName(name);
			vo.setMajor(major);
			vo.setScore(score);
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("������ �Ǽ��� �Է��ϼ���.");
		}

	}

}