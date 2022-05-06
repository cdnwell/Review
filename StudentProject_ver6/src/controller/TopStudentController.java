package controller;

import java.util.ArrayList;
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class TopStudentController implements Controller {

	@Override
	public void execute(Scanner sc) {
		ArrayList<StudentVO> list = StudentService.getInstance().maxScoreStudent();

		try {
			if (list == null) {
				throw new StudentException("�л� �����Ͱ� �ϳ��� �����ϴ�.");
			}

			for (StudentVO vo : list) {
				vo.printStudentInfo();
			}
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}

}
