package inner;
/*
 * 스태틱 메서드에서 스태틱 변수(클래스 변수)가 아닌 변수에 접근하지 못하는 이유
 * 1. 클래스가 만들어져서 초기화 됬는지 모르기 떄문이다.
 * 		클래스변수나 메서드는 사용하겠다는 선언과 동시에 모두 초기화되는 반면 인스턴스변수와
 * 		인스턴스 메서드는 클래스가 초기화된지 알 수 없다. 인스턴스메서드는 반드시 객체를 생성해야만
 * 		호출이 가능하다.
 */
public class OutterStaticClass {
	private int outter;
	private static double n = 23.4551;
	
	public OutterStaticClass(int outter) {
		this.outter = outter;
	}
	
	public static class InnerStaticClass{
		private int i;
		
		public InnerStaticClass(int i) {
			this.i = i;
		}
		
		public int sum() {
			//return i+outter;	//outter가 none static 이기 때문에 접근이 불가
			return (int)(i + n);
		}
	}
}
