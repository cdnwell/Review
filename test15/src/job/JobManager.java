package job;

public class JobManager {

	public void writeJobManage(String msg) {
		JobInfo.getInstance().writeJobInfo(msg);
		System.out.println("���� ������ ������Ʈ �Ͽ����ϴ�.");
		System.out.println("---------------------");
	}
	
}
