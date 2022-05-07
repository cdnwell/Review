package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Socket client = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		Scanner sc = null;
		
		try {
			client = new Socket("127.0.0.1",1234);
			pw = new PrintWriter(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			sc = new Scanner(System.in);
			
			while(true) {
				System.out.print("메세지를 입력해주세요>>>");
				String str = sc.nextLine();
				pw.println(str);
				pw.flush();
				if(str.equals("exit"))
					break;
				str= br.readLine();
				System.out.println(str);
			}
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(sc != null )sc.close();
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(client != null) client.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
