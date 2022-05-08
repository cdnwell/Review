package basicfour;

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
		BufferedReader br = null;
		
		try {
			server = new ServerSocket(1234);
			Socket client = server.accept();
			pw = new PrintWriter(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			String str = br.readLine();
			int num = Integer.parseInt(str);
			int sum = 0;
			for(int i=0;i<=num;i++) {
				sum += i;
			}
			pw.println(sum);
			pw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(server != null) server.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}