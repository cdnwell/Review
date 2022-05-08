package overload;

public class Overriding {
	
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.method(3, 5));
	}
	
}

class A{
	int method(int a, int b) {
		return a+b;
	}
}

class B extends A{
	int method(int a, int b) {
		System.out.println(super.method(a, b));
		return a*b;
	}
}