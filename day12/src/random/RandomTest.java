package random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println(r.nextDouble());	//0.0 ~ 0.99999... �������� ����
		System.out.println(r.nextInt());	//int�� �������� ����
		System.out.println(r.nextInt(10));	//0-9���� ����
		
		//������(�ּҰ�~�ִ밪) : random
		//r.nextInt((�ִ밪 +1 -�ּҰ�) + �ּҰ�)
		//r.nextInt((�ִ밪 -�ּҰ� +1) + �ּҰ�) ����ϱ� �� ����
		//36-97 ���ϱ�
		System.out.println();
		System.out.println(r.nextInt(62)+36);
	}

}
