package job;

public class JobManager {

	public void writeJobManager(String msg) {
		JobInfo.getInstance().writeJob(msg);
		System.out.println("���� ������ ������Ʈ �Ͽ����ϴ�.");
		System.out.println("-----------------------");
	}

}
