package service;

import java.util.ArrayList;

import exception.StudentException;
import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();

	public ArrayList<StudentVO> list;

	private StudentService() {
		list = new ArrayList<StudentVO>();
		list.add(new StudentVO("20201111", "홍길동", "컴퓨터공학과", 4.3));
		list.add(new StudentVO("20201112", "김철수", "경영학과", 3.0));
		list.add(new StudentVO("20201113", "이영희", "경제학과", 4.3));
		list.add(new StudentVO("20201114", "박영수", "생활체육학과", 4.3));
	}

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}

	public ArrayList<StudentVO> getList() {
		return list;
	}

	/**
	 * 학생정보 등록하는 메서드
	 * 
	 * @param vo 학생정보 한건에 해당함
	 * @return true면 학생정보 등록 성공, false면 학생정보 등록 실패
	 * @throws StudentException 학생번호가 중복되었을 때 발생
	 */
	public boolean registerStudent(StudentVO vo) throws StudentException {

		if (list.contains(vo)) {
			throw new StudentException("학번이 중복되었습니다.");
		}
		return list.add(vo);

	}

	public StudentVO searchStudent(String studentNo) throws StudentException {

		int i = list.indexOf(new StudentVO(studentNo, null, null, 0));
		if (i == -1) {
			throw new StudentException("검색한 학생정보 결과가 없습니다.");
		}

		return list.get(i);

	}

	public boolean deleteStudent(String studentNo) throws StudentException{

		return list.remove(new StudentVO(studentNo, null, null, 0));

	}

	public ArrayList<StudentVO> maxScoreStudent() {

		if (list.isEmpty())
			return null;

		StudentVO max = list.get(0);

		for (int i = 0; i < list.size(); i++) {
			if (max.getScore() < list.get(i).getScore())
				max = list.get(i);
		}

		ArrayList<StudentVO> result = new ArrayList<StudentVO>();

		for (int i = 0; i < list.size(); i++) {
			if (max.getScore() == list.get(i).getScore()) {
				result.add(list.get(i));
			}
		}

		return result;

	}// maxScoreStudent_method

}
