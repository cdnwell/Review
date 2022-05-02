package buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedWriterReader {

	public static void main(String[] args) {
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		FileReader fr = new FileReader("text.txt");
		BufferedReader br_f = new BufferedReader(fr);
		
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		String line = "";
		for(int i=1;(line = br_f.readLine())!=null;i++) {
			System.out.println(line);
		}
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
