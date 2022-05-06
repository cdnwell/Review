package job;

public class JobInfo {
	private static JobInfo instance = new JobInfo();
	private String jobInfo;
	
	private JobInfo() {}
	
	public static JobInfo getInstance() {
		if(instance == null)
			instance = new JobInfo();
		
		return instance;
	}
	
	public synchronized String getJobInfo() throws InterruptedException{
		String tmp=null;
		if(jobInfo == null)
			wait();
		tmp = jobInfo;
		jobInfo=null;
		return tmp;
	}
	
	public synchronized void writeJobInfo(String msg) {
		jobInfo = msg;
		notifyAll();
	}
	
}
