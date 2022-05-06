package job;

public class JobManager {

	public void writeJobManager(String msg) {
		JobInfo.getInstance().writeJob(msg);
		System.out.println("직업 정보를 업데이트 하였습니다.");
		System.out.println("-----------------------");
	}

}
