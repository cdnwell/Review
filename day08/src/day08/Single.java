package day08;

public class Single {
	private static Single singleton = new Single();
	private int count;
	
	private Single() {
		System.out.println("Single() 객체 생성!");
		count++;
	}
	
	static Single getInstance() {
		if(singleton == null)
			singleton = new Single();
		return singleton;
	}
	
	public int getCount() {
		return count;
	}
	
}
