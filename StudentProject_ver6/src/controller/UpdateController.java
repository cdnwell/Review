package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class UpdateController implements Controller {
	/*
	 * updatecontroller는 서비스가 필요하지 않고 controller에서만 수행된다.
	 */

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 수정을 시작합니다........");
		System.out.print("수정할 학생번호 입력 : ");
		String studentNo = sc.nextLine();
		StudentVO vo;
		try {
			vo = StudentService.getInstance().searchStudent(studentNo);
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("학과 : ");
			String major = sc.nextLine();
			System.out.print("평균 : ");
			double score = sc.nextDouble();
			sc.nextLine();
			
			vo.setName(name);
			vo.setMajor(major);
			vo.setScore(score);
			StudentService.getInstance().updateFile();
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("평점은 실수로 입력하세요.");
		}

	}

}