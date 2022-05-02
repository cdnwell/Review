package math;

public class MathClass {

	public static void main(String[] args) {
		System.out.println(Math.abs(-100));
		
		System.out.println(Math.ceil(3.4));
		System.out.println(Math.ceil(-3.4));
		
		System.out.println(Math.floor(3.4));
		System.out.println(Math.floor(-3.4));
		
		System.out.println(Math.round(3.4));
		System.out.println(Math.round(-3.4));
		
		System.out.println(Math.max(21, 30));
		System.out.println(Math.min(31, 20));
		
		System.out.println(Math.random());
		
		int random = ((int)(Math.random()*100))%45+1;
		System.out.println(random);
		
//		while(true) {
//			int random2 = (int)(Math.random()*100);
//			
//			System.out.println(Math.floor(Math.random()*45)+1);
//		}
	}

}
