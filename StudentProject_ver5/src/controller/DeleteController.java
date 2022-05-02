package controller;

import java.util.Scanner;

import exception.StudentException;
import service.StudentService;

public class DeleteController implements Controller {

	public void execute(Scanner sc) {

		try {
			System.out.println("학생정보 삭제를 시작합니다........");
			System.out.print("삭제할 학번을 입력하세요 : ");
			String studentNo = sc.nextLine();

			StudentService.getInstance().deleteStudent(studentNo);

			System.out.println("학생 정보가 정상적으로 삭제 되었습니다.");
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}

}
