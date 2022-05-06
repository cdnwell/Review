package job;

public class JobSeeker extends Thread{

	public JobSeeker(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println(getName()+"�� ���������� ���� ���Դϴ�.");
				String msg = JobInfo.getInstance().getJobInfo();
				if(msg != null) {
					System.out.println(msg + "�� " + getName()+"���� �����Ͽ����ϴ�.");
					System.out.println(getName() + " ������ ���� ����");
					return;
				}
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(getName() + " - ������ ����");
	}
	
}
