package movie;

public class MovieMain {

	public static void main(String[] args) {
		Customer[] arr = new Customer[7];
		arr[0] = new Customer("±è¾¾");
		arr[1] = new Customer("ÀÌ¾¾");
		arr[2] = new Customer("¹Ú¾¾");
		arr[3] = new Customer("°ø¾¾");
		arr[4] = new Customer("°û¾¾");
		arr[5] = new Customer("¸ñ¾¾");
		arr[6] = new Customer("Á¤¾¾");
		
		for(Customer c : arr)
			c.start();
		
		try {
			Thread.sleep(20000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		Cinema.getInstance().allSeatPrintInfo();
		
	}

}
