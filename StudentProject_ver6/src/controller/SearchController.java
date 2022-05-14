package controller;

import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class SearchController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생번호를 이용해서 조회를 시작합니다...........");
		System.out.print("조회할 학번 입력 : ");
		String studentNo=sc.nextLine();
		StudentVO vo;
		try {
			vo = StudentService.getInstance().searchStudent(studentNo);
			vo.printStudentInfo();
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}//if문 쓸필요없이 try catch문으로 오류 잡음
	}

}