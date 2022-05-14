package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			server = new ServerSocket(); 
			InetSocketAddress isa = new InetSocketAddress(1234);
			server.bind(isa);
			
			
			Socket client = server.accept();
			
			pw = new PrintWriter(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			String str = br.readLine();
			System.out.println(str);
			pw.println("������ ���� �޼���");
			pw.flush();
			
		}catch (IOException e) {
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
