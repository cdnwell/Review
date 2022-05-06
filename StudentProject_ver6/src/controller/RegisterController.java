package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class RegisterController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 등록을 시작합니다.");

		// 학생정보 입력

		try {// 에러 메시지를 굳이 쓸 필요가 없다. boolean 값도 없애줌.
			System.out.print("학번 : ");
			String studentNo = sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("학과 : ");
			String major = sc.nextLine();
			System.out.print("평균 : ");
			double score = sc.nextDouble(); // 실수를 입력받아야 되는데 다른 값을 받았을 때 catch
			sc.nextLine();
			StudentService.getInstance().registerStudent(new StudentVO(studentNo, name, major, score));
			System.out.println("학생정보 등록 완료");
			StudentService.getInstance().updateFile();
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("점수를 잘못 입력헀습니다.");
		}
	}

}
