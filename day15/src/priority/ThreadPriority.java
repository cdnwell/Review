package priority;

public class ThreadPriority extends Thread{

	public ThreadPriority(String name) {
		super(name);
		System.out.println(name + " - ������ ����");
	}
	
	@Override
	public void run() {
		try {
			for(int i=0;i<100;i++)
				Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName()+ " - ������ ����");
	}
}
