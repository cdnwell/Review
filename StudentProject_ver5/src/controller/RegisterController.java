package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class RegisterController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("�л� ���� ����� �����մϴ�.");

		// �л����� �Է�

		try {// ���� �޽����� ���� �� �ʿ䰡 ����. boolean ���� ������.
			System.out.print("�й� : ");
			String studentNo = sc.nextLine();
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("�а� : ");
			String major = sc.nextLine();
			System.out.print("��� : ");
			double score = sc.nextDouble(); // �Ǽ��� �Է¹޾ƾ� �Ǵµ� �ٸ� ���� �޾��� �� catch
			sc.nextLine();
			StudentService.getInstance().registerStudent(new StudentVO(studentNo, name, major, score));
			System.out.println("�л����� ��� �Ϸ�");
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("������ �߸� �Է������ϴ�.");
		}
	}

}
