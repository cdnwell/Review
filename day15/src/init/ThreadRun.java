package init;

public class ThreadRun extends Thread{
	public ThreadRun(String name) {
		super(name);
		System.out.println(name + " - 스레드 생성");
	}
	
	@Override
	public void run() {
		for(int i=0;i<1000000;i++);
		
		System.out.println(getName() + " 스레드 종료");
	}
	
}
