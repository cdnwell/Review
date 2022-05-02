package stream;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class FileReadMain {

	public static void main(String[] args) {
		FileReader fr = null;		//��彺Ʈ��
		BufferedReader br =null;	//���μ��� ��Ʈ��, ���ϰ� �д� ��
		
		try {
			fr = new FileReader("gisa.txt");
			br = new BufferedReader(fr);	//reader�迪���� �ްڴ�, �Ϲ� ��Ʈ���� �ȵ�
			//�Ϲ� ��Ʈ���̸� ��Ʈ���� ������ �ٲ��ִ� ���μ��� �ʿ�
			//���� ������ ������ ���� ó�� �߻�
			//����� ����¸� ���� Ȯ��
			String str = null;
			
//			while((str = br.readLine()) != null) {
//				System.out.println(str);
//			}
			
			while(true) {
				str = br.readLine();	//���Ͽ��� ���� �о����
				if(str==null) break;	//�о�� ������ null�̸� ���̻� ���� ������ ����.
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
