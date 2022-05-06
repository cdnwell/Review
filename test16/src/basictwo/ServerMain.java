package basictwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class ServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			server = new ServerSocket(1234);
			Socket client = server.accept();
			pw = new PrintWriter(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			pw.println("Ŭ���̾�Ʈ���� ������ �޼���");
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
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}