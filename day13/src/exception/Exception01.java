package exception;

public class Exception01 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(5/0);
			System.out.println(2);
		}catch(Exception e) {
			System.out.println(5);
		}
		System.out.println(6);
	}

}
