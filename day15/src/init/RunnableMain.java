package init;

public class RunnableMain {

	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableRun(),"������1");
		Thread t2 = new Thread(new RunnableRun(),"������2");
		Thread t3 = new Thread(new RunnableRun(),"������3");
		Thread t4 = new Thread(new RunnableRun(),"������4");
		Thread t5 = new Thread(new RunnableRun(),"������5");
		Thread t6 = new Thread(new RunnableRun(),"������6");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}

}
