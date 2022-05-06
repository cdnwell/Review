package job;

public class JobManager {

	public void writeJobManage(String msg) {
		JobInfo.getInstance().writeJobInfo(msg);
		System.out.println("직원 정보를 업데이트 하였습니다.");
		System.out.println("---------------------");
	}
	
}
