package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerWorker extends Thread {
	Socket client = null;
	PrintWriter pw = null;
	BufferedReader br = null;

	ServerWorker(Socket client) {
		this.client = client;

		try {
			pw = new PrintWriter(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				String str = br.readLine();
				if (str == null || str.equals("exit"))
					break;
				pw.println(str);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			EchoMultiServerMain.list.remove(this);
			System.out.println(client.getInetAddress()+"님이 접속하셨습니다.");
			try {
				if (br != null)
					br.close();
				if (pw != null)
					pw.close();
				if (client != null)
					client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
