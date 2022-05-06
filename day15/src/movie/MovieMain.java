package movie;

public class MovieMain {

	public static void main(String[] args) {
		Customer[] arr = new Customer[7];
		arr[0] = new Customer("�达");
		arr[1] = new Customer("�̾�");
		arr[2] = new Customer("�ھ�");
		arr[3] = new Customer("����");
		arr[4] = new Customer("����");
		arr[5] = new Customer("��");
		arr[6] = new Customer("����");
		
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
