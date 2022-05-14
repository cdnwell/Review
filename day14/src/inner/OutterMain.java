package inner;

import inner.OutterClass.InnerClass;

public class OutterMain {
	/*
	 * innerclass로 객체를 만들기 위해서 import를 통해 클래스를 가져왔다.
	 */
	public static void main(String[] args) {
		OutterClass outter = new OutterClass(100);
		InnerClass inClass = outter.new InnerClass(20);
		System.out.println(inClass.sum());
		inClass = outter.new InnerClass(40);
		System.out.println(inClass.sum());
		
		OutterStaticClass out = new OutterStaticClass(100);
		OutterStaticClass.InnerStaticClass in = new OutterStaticClass.InnerStaticClass(5);
		System.out.println(in.sum());
		
	}

}
