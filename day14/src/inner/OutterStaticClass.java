package inner;
/*
 * ����ƽ �޼��忡�� ����ƽ ����(Ŭ���� ����)�� �ƴ� ������ �������� ���ϴ� ����
 * 1. Ŭ������ ��������� �ʱ�ȭ ����� �𸣱� �����̴�.
 * 		Ŭ���������� �޼���� ����ϰڴٴ� ����� ���ÿ� ��� �ʱ�ȭ�Ǵ� �ݸ� �ν��Ͻ�������
 * 		�ν��Ͻ� �޼���� Ŭ������ �ʱ�ȭ���� �� �� ����. �ν��Ͻ��޼���� �ݵ�� ��ü�� �����ؾ߸�
 * 		ȣ���� �����ϴ�.
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
			//return i+outter;	//outter�� none static �̱� ������ ������ �Ұ�
			return (int)(i + n);
		}
	}
}
