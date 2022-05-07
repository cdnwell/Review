package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServerMain {
	
	private static ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	
	private static class ServerWorker extends Thread{
		private Socket client;
		private PrintWriter pw;
		private BufferedReader br;
		
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
					if(str == null || str.equals("exit")) break;
					broadCasting(client.getInetAddress()+"���� �޽��� : "+str);
				}
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				list.remove(this);
				System.out.println(client.getInetAddress()+"���� ������ �����Ͽ����ϴ�.");
				broadCasting(client.getInetAddress()+"���� ������ �����Ͽ����ϴ�.");
				try {
					if(br != null) br.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		public void sendMessage(String msg) {
			pw.println(msg);
			pw.flush();
		}
	}
	
	public static void broadCasting(String msg) {
		for(int i = 0; i<list.size();i++) {
			list.get(i).sendMessage(msg);
		}
	}
	
	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(1234);
			while(true) {
				Socket client = server.accept();
				ServerWorker worker = new ServerWorker(client);
				worker.start();
				list.add(worker);
				System.out.println(client.getInetAddress()+"���� �����ϼ̽��ϴ�.");
				System.out.println(list.size()+"<<���� ���� �ο�");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
