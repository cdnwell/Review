package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class EchoMultiServerMain2 {
	private static ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();

	private static class ServerWorker extends Thread {
		Socket client = null;
		PrintWriter pw = null;
		BufferedReader br = null;

		ServerWorker(Socket client){
			this.client = client;
			try {
			pw = new PrintWriter(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		public void run() {
			try {
				while(true) {
					String str = br.readLine();
					if(str == null || str.equals("exit"))
						break;
					pw.println(str);
					pw.flush();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}finally{
				list.remove(this);
				System.out.println(client.getInetAddress()+"님이 접속을 종료하셨습니다.");
				System.out.println("현재 인원 : " + list.size());
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

	public static void main(String[] args) {
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(1234);
			System.out.println("서버 오픈!");
			while(true) {
				Socket client = server.accept();
				System.out.println(client.getInetAddress()+"님이 접속했습니다.");
				ServerWorker worker = new ServerWorker(client);
				worker.start();
				list.add(worker);
				System.out.println("현재 인원 : " + list.size());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
