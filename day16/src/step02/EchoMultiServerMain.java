package step02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class EchoMultiServerMain {
	public static ArrayList <ServerWorker> list = new ArrayList<ServerWorker>();
	
	
	public static void main(String[] args) {
		ServerSocket server = null;
		
		
		try {
			server = new ServerSocket(1234);
			while(true) {
			Socket client = server.accept();
			System.out.println(client.getInetAddress()+ "���� �����ϼ̽��ϴ�.");
			ServerWorker worker = new ServerWorker(client);
			worker.start();
			list.add(worker);
			System.out.println("���������ο� : "+list.size());
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
