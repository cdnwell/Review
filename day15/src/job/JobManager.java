package job;

public class JobManager {

	public void writeJobManager(String msg) {
		JobInfo.getInstance().writeJob(msg);
		System.out.println("");
		System.out.println("-----------------------");
	}

}
