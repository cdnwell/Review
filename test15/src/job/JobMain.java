package job;

import java.util.Scanner;

public class JobMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JobSeeker[] arr = new JobSeeker[10];
		for(int i=0;i<10;i++) {
			arr[i]=new JobSeeker("구직자"+i);
			arr[i].start();
		}
		
		JobManager manager = new JobManager();
		for(int i=0;i<10;i++) {
			System.out.print("직업 정보 입력>");
			String str = sc.nextLine();
			manager.writeJobManage(str);
		}
		
	}

}
