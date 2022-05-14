package day08;

public class SingleMain {

	public static void main(String[] args) {
		Single sg1= Single.getInstance();
		Single sg2= Single.getInstance();
		System.out.println(sg1.getCount());
		System.out.println(sg2.getCount());
		System.out.println(sg1);
		System.out.println(sg2);

		System.out.println("--------");

		System.out.println(sg1==sg2);
	}

}
