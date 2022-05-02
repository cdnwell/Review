package stream;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class FileReadMain {

	public static void main(String[] args) {
		FileReader fr = null;		//노드스트림
		BufferedReader br =null;	//프로세스 스트림, 편하게 읽는 것
		
		try {
			fr = new FileReader("gisa.txt");
			br = new BufferedReader(fr);	//reader계역ㄹ만 받겠다, 일반 스트림은 안됨
			//일반 스트림이면 스트림을 리더로 바꿔주는 프로세스 필요
			//읽을 때에는 없으면 예외 처리 발생
			//쓰기는 입출력만 예외 확인
			String str = null;
			
//			while((str = br.readLine()) != null) {
//				System.out.println(str);
//			}
			
			while(true) {
				str = br.readLine();	//파일에서 한줄 읽어들임
				if(str==null) break;	//읽어온 내용이 null이면 더이상 읽을 내용이 없다.
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
