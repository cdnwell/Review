package exception;

public class Exception02 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(5/3);
			System.out.println(2);
			
			int[] arr = {0,1,2};
			arr[3]++;
			System.out.println(3);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException!");
			e.printStackTrace();
		}
		System.out.println(5);
	}

}
