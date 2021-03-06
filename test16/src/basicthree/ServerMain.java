package basicthree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		PrintWriter pw = null;
		BufferedReader br =null;
		
		try {
			server = new ServerSocket(1234);
			Socket client = server.accept();
			pw = new PrintWriter(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			
			String str = br.readLine();
			System.out.println(str);
			pw.println("서버에서 보냅니다... Client...");
			pw.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
