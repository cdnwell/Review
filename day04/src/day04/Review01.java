package day04;

public class Review01 {

	public static void main(String[] args) {
		int ii = 1;
		
		for (;ii<10 ;) {
			System.out.println(ii++);
		//9까지 출력될 것이다.
		}
		
		for(int dan =2;dan<10;dan++) {
			System.out.println(dan+"단");
			for(int i=1;i<10;)
				System.out.println(dan+" * "+i+" = "+(dan*i++));
		}
		
	}

}
