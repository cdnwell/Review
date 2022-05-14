package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OneChatServerMain {
	
	public static void main(String[] args) {
		ServerSocket server = null;
		Scanner sc = null;
		PrintWriter pw = null;
		ServerWorker sw = null;
		
		try {
			server = new ServerSocket(1234);
			Socket client = server.accept();
			pw = new PrintWriter(client.getOutputStream());
			sc = new Scanner(System.in);
			sw = new ServerWorker(client);
			sw.start();
			
			while(true) {
				System.out.println("메시지 입력>>>");
				String str = sc.nextLine();
				pw.println(str);
				pw.flush();
				if(str.equals("exit")) break;
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pw != null) pw.close();
				if(sc != null) sc.close();
				if(server != null) server.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static class ServerWorker extends Thread{
		private Socket client;
		private BufferedReader br;
		
		
		ServerWorker(Socket client){
			this.client = client;
			
			try {
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		public void run() {
			try {
				while(true) {
					String str = br.readLine();
					if(str == null || str.equals("exit")) break;
					System.out.println(str);
				}
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(br != null) br.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
