package join;

public class JoinTest {

	public static void main(String[] args) {
		JoinThread j = new JoinThread("Join");
		
		j.start();
		
		try {
			j.join(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main thread exit");
	}
	
}
