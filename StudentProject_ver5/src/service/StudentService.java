package service;

import java.util.ArrayList;

import exception.StudentException;
import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();

	public ArrayList<StudentVO> list;

	private StudentService() {
		list = new ArrayList<StudentVO>();
		list.add(new StudentVO("20201111", "ȫ�浿", "��ǻ�Ͱ��а�", 4.3));
		list.add(new StudentVO("20201112", "��ö��", "�濵�а�", 3.0));
		list.add(new StudentVO("20201113", "�̿���", "�����а�", 4.3));
		list.add(new StudentVO("20201114", "�ڿ���", "��Ȱü���а�", 4.3));
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
	 * �л����� ����ϴ� �޼���
	 * 
	 * @param vo �л����� �Ѱǿ� �ش���
	 * @return true�� �л����� ��� ����, false�� �л����� ��� ����
	 * @throws StudentException �л���ȣ�� �ߺ��Ǿ��� �� �߻�
	 */
	public boolean registerStudent(StudentVO vo) throws StudentException {

		if (list.contains(vo)) {
			throw new StudentException("�й��� �ߺ��Ǿ����ϴ�.");
		}
		return list.add(vo);

	}

	public StudentVO searchStudent(String studentNo) throws StudentException {

		int i = list.indexOf(new StudentVO(studentNo, null, null, 0));
		if (i == -1) {
			throw new StudentException("�˻��� �л����� ����� �����ϴ�.");
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
