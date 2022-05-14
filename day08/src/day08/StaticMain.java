package day08;

public class StaticMain {

	int num=100;
	
	void numPrint() {
		System.out.println("numPrint() 실행!"+num);
	}
	
	public static void main(String[] args) {
		
		System.out.println(Static.num);
		Static.printF();
		Static static1 = new Static();
		static1.printFRe();
		
		StaticMain stat = new StaticMain();
		stat.num+=10;
		stat.numPrint();
		
	}

}
