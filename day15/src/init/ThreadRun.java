package init;

public class ThreadRun extends Thread{
	public ThreadRun(String name) {
		super(name);
		System.out.println(name + " - 실행" );
	}
	
	@Override
	public void run() {
		for(int i=0;i<1000000;i++);
		
		System.out.println(getName() + " - 실행 종료" );
	}
	
}
