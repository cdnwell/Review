package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) {
		Socket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			server = new Socket("127.0.0.1",1234);
			
			pw = new PrintWriter(server.getOutputStream());
			br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			
			pw.println("Hello");
			pw.flush();
			String str = br.readLine();
			System.out.println(str);
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pw != null) pw.close();
				if(br != null) br.close();
				if(server != null) server.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
