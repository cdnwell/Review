package basictwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) {
		Socket client = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		try {
			client = new Socket("127.0.0.1", 1234);
			pw = new PrintWriter(client.getOutputStream());
			br = new BufferedReader( new InputStreamReader(client.getInputStream()));
					
			String str = br.readLine();
			System.out.println(str);
			pw.println("서버로 보내는 메세지");
			pw.flush();
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(client != null) client.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
