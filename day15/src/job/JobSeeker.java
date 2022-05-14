package job;

public class JobSeeker extends Thread{

	public JobSeeker(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println(getName()+ "");
				String msg = JobInfo.getInstance().getJobInfo();
				if(msg != null) {
					System.out.println(msg + "" + getName()+ "");
					System.out.println(getName() + "");
				}
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
