package controller;

import java.util.ArrayList;
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class PrintAllController implements Controller {

	@Override
	public void execute(Scanner sc) {

		ArrayList<StudentVO> list = StudentService.getInstance().getList();

		try {
			if (list.isEmpty())
				throw new StudentException("�л� �����Ͱ� �ϳ��� �����ϴ�.");

			for (int i = 0; i < list.size(); i++) {
				list.get(i).printStudentInfo();
			}
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}

}
