package file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("c:\\test\\test.txt");
		System.out.println(file);
		System.out.println(file.getParent());
		File parentFile = file.getParentFile();	//class File�� ��ȯ
		System.out.println(parentFile);
		
		System.out.println(parentFile.exists());
		//���� ���� ���� ������ ��ġ�� ���� ��ΰ� �ִ��� üũ
		if(!parentFile.exists()) {
			//��ΰ� ���� �� �ش� ��α����� ��� ������ ����
			parentFile.mkdirs();
			System.out.println("�ش� ��� ������ ��� ����");
		}
		try {
			boolean result = file.createNewFile();
			System.out.println(result);
			file.delete();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
