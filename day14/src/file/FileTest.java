package file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("c:\\test\\test.txt");
		System.out.println(file);
		System.out.println(file.getParent());
		File parentFile = file.getParentFile();	//class File로 반환
		System.out.println(parentFile);
		
		System.out.println(parentFile.exists());
		//파일 생성 전에 파일이 위치한 폴더 경로가 있는지 체크
		if(!parentFile.exists()) {
			//경로가 없을 떄 해당 경로까지의 모든 폴더를 생성
			parentFile.mkdirs();
			System.out.println("해당 경로 폴더를 모두 생성");
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
