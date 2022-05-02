package stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NotePad {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		FileWriter fw =null;
		PrintWriter pw =null;
		System.out.print("텍스트 파일명:");
		String str = sc.nextLine();
		str += ".txt";
		try {
			fw = new FileWriter(str);
			pw = new PrintWriter(fw);
			
			while(true) {
				String str1 = sc.nextLine();
				if(str1.equals("exit"))
					break;
				pw.println(str1);
				pw.flush();
			}
		}catch(IOException e) {
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
