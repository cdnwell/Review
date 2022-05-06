package obj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("person.dat");
			oos = new ObjectOutputStream(fos);
			
			Person p = new Person("ȫ�浿",100);

			oos.writeObject(p);
			oos.flush();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos != null) oos.close();
				if(fos != null) fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
