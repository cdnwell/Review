package basicsix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		PrintWriter pw = null;
		BufferedReader br =null;
		
		try {
			server = new ServerSocket(1234);
			Socket client = server.accept();
			pw = new PrintWriter(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat();
			sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
			
			String str = br.readLine();
			System.out.println(str);
			pw.println("Client 여긴 " + sdf.format(cal.getTime()) +" 입니다.");
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
