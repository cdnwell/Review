package stream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOTest {
	
	public String readline() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		char buffer[] = new char[10];	//�Է¹��� ���� �ӽ÷� �����ϴ� �迭
		String message = null;
		int idx = 0;//������ ������ �Ǿ��� �ε��� ��ȣ üũ
		
		try {
			do {
				//�迭�� ������ ������ ������ �迭�� ���̸� �ø�
				if(idx == buffer.length-1)//�̋� �迭�� ������ ������ �ִ� ����
					buffer = reallocBuffer(buffer);//�迭 �ø���
				buffer[idx] = (char) isr.read();//�ѱ��ھ� �Է�
				idx++;
				
			}while(buffer[idx-1] != '\n');//���͸� ������ ���Ḧ �ϰڴ�.
			
			for (int i = 0;i<idx;i++) {
				System.out.println((int)buffer[i]+" ");
			}//�߰��� ����, �Ŀ�����Ʈ���� ���� for��
			//13, 10�� ���ڵ� �߰��Ǵ� �� ��
			
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
			osw.flush();	//write�� �ϸ�,����� �ϸ� ������ flush�� �־�� �Ѵ�.
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