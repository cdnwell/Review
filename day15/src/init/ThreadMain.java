package init;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadRun run1 = new ThreadRun("������1");
		ThreadRun run2 = new ThreadRun("������2");
		ThreadRun run3 = new ThreadRun("������3");
		ThreadRun run4 = new ThreadRun("������4");
		ThreadRun run5 = new ThreadRun("������5");
		ThreadRun run6 = new ThreadRun("������6");
		
		run1.start();
		run2.start();
		run3.start();
		run4.start();
		run5.start();
		run6.start();
	}

}
