package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.UnknownHostException;
import java.util.Scanner;

public class OneChatClientMain {

	private static class ClientWorker extends Thread {
		private Socket client = null;
		private BufferedReader br = null;

		ClientWorker(Socket client) {
			this.client = client;

			try {
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		public void run() {

			try {
				while (true) {

					String str = br.readLine();
					if (str == null || str.equals("exit"))
						break;
					System.out.println(str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null)
						br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

	public static void main(String[] args) {
		Socket server = null;
		Scanner sc = null;
		PrintWriter pw = null;
		ClientWorker cw = null;
		
		try {
			server = new Socket("127.0.0.1", 1234);
			sc = new Scanner(System.in);
			pw = new PrintWriter(server.getOutputStream());
			cw = new ClientWorker(server);
			cw.start();
			
			while (true) {
				System.out.println("메시지 입력 >>>");
				String str = sc.nextLine();
				pw.println(str);
				pw.flush();
				if (str.equals("exit"))
					break;
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pw != null)
					pw.close();
				if (sc != null)
					sc.close();
				if (server != null)
					server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
