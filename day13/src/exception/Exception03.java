package exception;

public class Exception03 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(5/0);
			System.out.println(2);
		}catch(Exception e) {
			System.out.println("Exception");
//			System.out.println(e);
		}finally {
			System.out.println(3);
		}
		System.out.println(4);
		
	}

}
