package stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterMain01 {

	public static void main(String[] args) {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			
			fw = new FileWriter("hello.txt",true);
			pw = new PrintWriter(fw);
			
			pw.println("æ»≥Á«œººø‰");
			pw.println("Hello World");
			pw.flush();
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pw != null) pw.close();
				if(fw != null) fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
