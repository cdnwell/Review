package stream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOTest {
	
	public String readline() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		char buffer[] = new char[10];	//입력받은 내용 임시로 저장하는 배열
		String message = null;
		int idx = 0;//어디까지 저장이 되었나 인덱스 번호 체크
		
		try {
			do {
				//배열에 내용이 가득차 있으면 배열의 길이를 늘림
				if(idx == buffer.length-1)//이떄 배열에 내용이 가득차 있는 상태
					buffer = reallocBuffer(buffer);//배열 늘리기
				buffer[idx] = (char) isr.read();//한글자씩 입력
				idx++;
				
			}while(buffer[idx-1] != '\n');//엔터를 만나면 종료를 하겠다.
			
			for (int i = 0;i<idx;i++) {
				System.out.println((int)buffer[i]+" ");
			}//추가된 문장, 파워포인트에는 없는 for문
			//13, 10번 문자도 추가되는 걸 봄
			
//			buffer[idx-1] = '\0';
			System.out.println();
			message = String.copyValueOf(buffer,0,idx-2);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(isr != null) isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return message;
	}
	
	private char[] reallocBuffer(char[] buffer) {
		char []temp = buffer;
		buffer = new char[temp.length * 2];
		for(int i= 0; i<temp.length;i++) {
			buffer[i] = temp[i];
		}
		return buffer;
	}
	
	public void println(String msg) {
		char buf[] = msg.toCharArray();
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		try {
			osw.write(buf);
			osw.flush();	//write를 하면,출력을 하면 무조건 flush가 있어야 한다.
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(osw != null) osw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}